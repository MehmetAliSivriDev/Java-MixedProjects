
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Carpim Tablosunu Goruntulemek Istediginiz Sayiyi Giriniz= ");       
        int sayi = scanner.nextInt();
        int i,j;
        int sonuc = 1;
        
        for (i=1;i <= sayi;i++)
        {
            System.out.println("***********************************\n" +
                                i + "'in Carpim Tablosu\n"
                                + "***********************************");
            for (j = 1;j <= 9;j++)
            {
                sonuc = i * j ;  
                System.out.println(i + "*" + j + "=" + sonuc);  
            }
            
        }
        
        
    }
    
}
