
import java.util.Scanner;


public class Main {

    private static Kart[][] kartlar = new Kart[2][2];
    
    public static void main(String[] args) {
        
        kartlar[0][0] = new Kart('A');
        kartlar[0][1] = new Kart('B');
        kartlar[1][0] = new Kart('A');
        kartlar[1][1] = new Kart('B');
        
        oyunTahtasi();
        
        while(oyunBittiMi() == false)
        {
            tahminEt();
            oyunTahtasi();
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
                    System.out.print("|" + " |");
                }
                
            }
            System.out.println("");
        }
        System.out.println("-------");
    }
    
    public static boolean oyunBittiMi()
    {
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                if (kartlar[i][j].isTahmin() == false)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void tahminEt()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Tahmininizi Yapiniz (i degeri bosluk j degeri) Seklinde Giriniz= ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        
        System.out.print("Ikinci Tahmininizi Yapiniz (i degeri bosluk j degeri) Seklinde Giriniz= ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger())
        {
            System.out.println("Tebrikler Dogru Tahmin Ettiniz!");
            kartlar[i2][j2].setTahmin(true);
        }
        else
        {
            System.out.println("Yanlis Tahmin Ettiniz!");
            kartlar[i1][j1].setTahmin(false);
        }
    }
}
