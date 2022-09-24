
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String kullaniciadi = "admin";
        String sifre = "1234";
        
        int kalanhak = 3;
        
        String kontrolk;
        String kontrols;
        
        while (true)
        {
            System.out.print("Kullanici Adi= ");
            kontrolk = scanner.nextLine();
            
            System.out.print("Sifre= ");
            kontrols = scanner.nextLine();
                    
            
            if (kontrolk.equals(kullaniciadi) && kontrols.equals(sifre))
            {
                System.out.print("Giris Basarili!");
                break;
            }
            else if (!kontrolk.equals(kullaniciadi) && !kontrols.equals(sifre)) 
            {
                System.out.println("Yanlis SIFRE ve KULLANICI ADI!");
                System.out.println("Giris Basarisiz Lutfen Tekrar Deneyiniz!");
                kalanhak--;
                System.out.println("Kalan Giris Hakkiniz= " + kalanhak);
                
                while (kalanhak == 0)
                {
                    System.out.println("Giris Hakkiniz Dolmustur Sistemden"
                                     + " Cikariliyorsunuz");
                    System.exit(0);
                }
                
            }
            else if (kontrolk.equals(kullaniciadi) && !kontrols.equals(sifre)) 
            {
                System.out.println("Yanlis SIFRE!");
                System.out.println("Giris Basarisiz Lutfen Tekrar Deneyiniz!");
                kalanhak--;
                System.out.println("Kalan Giris Hakkiniz= " + kalanhak);
                
                while (kalanhak == 0)
                {
                    System.out.println("Giris Hakkiniz Dolmustur Sistemden"
                                     + " Cikariliyorsunuz");
                    System.exit(0);
                }
                
            }
            else if (!kontrolk.equals(kullaniciadi) && kontrols.equals(sifre)) 
            {
                System.out.println("Yanlis KULLANICI ADI");
                System.out.println("Giris Basarisiz Lutfen Tekrar Deneyiniz!");
                kalanhak--;
                System.out.println("Kalan Giris Hakkiniz= " + kalanhak);
                
                while (kalanhak == 0)
                {
                    System.out.println("Giris Hakkiniz Dolmustur Sistemden"
                                     + " Cikariliyorsunuz");
                    System.exit(0);
                }
                
            }
            
        }
        
    }

    
}
