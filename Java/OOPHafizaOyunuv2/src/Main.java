
import java.util.Random;
import java.util.Scanner;


public class Main {
    
    private static Kart[][] kartlar = new Kart[2][2];

    public static void main(String[] args) {
        
        degerYerlestir();
        oyunTahtasi();
        
        while(oyunBittiMi() == false)
        {
            tahminEt();
            oyunTahtasi();
        }
        
    }
    
    public static void degerYerlestir()
    {
        Random random = new Random();
        
        int Asayisi = 0,Bsayisi =0;

        for (int i=0;i<2;i++)
        {
              
            for(int j=0;j<2;j++)
            {
                int a = random.nextInt(2);  
                
                if (a == 0)
                {
                    if(Asayisi < 2)
                    {
                        Asayisi += 1; 
                        kartlar[i][j] = new Kart('A');
                    }
                    else
                    {
                        kartlar[i][j] = new Kart('B');
                    }
                }
                else if (a == 1)
                {
                    if(Bsayisi < 2)
                    {
                        Bsayisi += 1; 
                        kartlar[i][j] = new Kart('B');
                    }
                    else
                    {
                        kartlar[i][j] = new Kart('A');
                    }
                }
            }
        }     
    }
    
    public static void oyunTahtasi()
    {
        for (int i=0;i<2;i++)
        {
            System.out.println("-------");
            System.out.print(i);
            for (int j=0;j<2;j++)
            {
                if (kartlar[i][j].isTahmin() == true)
                {
                    System.out.print("|" + kartlar[i][j].getDeger() + "|");
                }
                else
                {
                    System.out.print("| |");
                }
            }
            System.out.println("");
                         
        }
         System.out.println("-------");
    }
    
    public static void tahminEt()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Degeri Giriniz (i degeri bosluk j degeri) Seklinde Giriniz= ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        
        System.out.print("Ikinci Degeri Giriniz (i degeri bosluk j degeri) Seklinde Giriniz= ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger())
        {
            System.out.println("Tebrikler Dogru Tahmin Ettiniz!");
            kartlar[i2][j2].setTahmin(true);
        }
        else
        {
            System.out.println("Yanlis Tahmin Yaptiniz");
            kartlar[i1][j1].setTahmin(false);
        }
    }
    
    public static boolean oyunBittiMi()
    {
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                if(kartlar[i][j].isTahmin() == false)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
