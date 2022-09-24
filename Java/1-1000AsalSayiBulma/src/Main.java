
public class Main {
    
    public static boolean asalKontrol (int sayi)
    {
            for (int i=2;i<sayi;i++)
            {
                if (sayi % i == 0)
                {
                    return false;
                } 
            }
            return true;
    }
        
    public static void main(String[] args) {
        
        
        for (int j=1;j<=1000;j++)
        {
            if (asalKontrol(j) == true)
            {
                System.out.println(j + "\n");
            }
        }
        
    }
    
    
}
