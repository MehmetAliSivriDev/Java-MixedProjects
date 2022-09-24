
import java.util.Scanner;


public class ATM {

    public void run (HesapIslemleri hesap1)
    {
        Scanner scanner = new Scanner(System.in);
        
        LoginIslemleri login = new LoginIslemleri();
        
        System.out.println("************************");
        System.out.println("Kullanici Giris Paneli");
        System.out.println("************************");
        
        int girishakki = 3;
        
        while (true)
        {
            if (login.login(hesap1))
            {
                System.out.println("Giris Basarili!");
                break;
            }
            else
            {
                girishakki -= 1;
                System.out.println("Giris Basarisiz! Kalan Giris Hakkiniz= " + girishakki);
                
                if (girishakki == 0)
                {
                    System.out.println("Tum Giris Haklariniz Tukendi Sistem Cikartiliyorsunuz!");
                    System.exit(0);
                }
            }
            
        }
        
        String islemler = "1-Bakiye Goruntuleme\n"
                + "2-Para Yatirma\n"
                + "3-Para Cekme\n"
                + "q-Cikis Yapma\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        System.out.println("SIVRI BANK SISTEMINE HOS GELDINIZ\n");

        
        while (true)
        {
            System.out.print(islemler);
            String secim = scanner.nextLine();
            
            if (secim.equals("1"))
            {
                System.out.println("Mevcut Bakiyeniz= " + hesap1.getBakiye());
            }
            else if (secim.equals("2"))
            {
                System.out.print("Yatirmak Istediginiz Para Miktarini Giriniz= ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap1.paraYatirma(miktar);
            }
            else if (secim.equals("3"))
            {
                System.out.print("Cekmek Istediginiz Para Miktarini Giriniz= ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap1.paraCekme(miktar);
            }
            else if (secim.equals("q"))
            {
                break;
            }
            else
            {
                System.out.println("Hatali Secim Yaptiniz!");
            }
        }
        
        
                
    }

    
}
