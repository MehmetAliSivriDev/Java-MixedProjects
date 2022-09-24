
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        HesapIslemleri hesap1 = new HesapIslemleri("admin", "1234", 1000, 10, 80, 100);
        LoginKontrol login = new LoginKontrol();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***********************************");
        System.out.println("KULLANICI GIRIS PANELI");
        System.out.println("***********************************");
        
        int girisHakki = 3;
        
        while (true)
        {
            if (login.loginIslemi(hesap1) == true)
            {
                System.out.println("Giris Basarili!");
                break;
            }
            else
            {
                girisHakki -= 1;
                System.out.println("Giris Basarisiz! Kalan Giris Hakkiniz= " + girisHakki);
                
                if (girisHakki == 0)
                {
                    System.out.println("Giris Hakkinizi Tukettiniz Sistemden Cikartiliyorsunuz!");
                    System.exit(0);
                }
            }
        }
        
        String islemler = "1-Bakiye Sorgulama\n"
                + "2-Para Yatirma\n"
                + "3-Para Cekme\n"
                + "4-Doviz Islemleri\n"
                + "q-Sistemden Cikis Yapma\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        while (true)
        {
            System.out.print(islemler);
            String secim = scanner.nextLine();
            
            if (secim.equals("1"))
            {
                System.out.println("Guncel Tl Bakiyeniz= " + hesap1.getTlBakiye());
                System.out.println("Guncel Dolar Bakiyeniz= " + hesap1.getDolarBakiye());
                System.out.println("Guncel Euro Bakiyeniz= " + hesap1.getEuroBakiye());
                System.out.println("Guncel Altin (gr) Bakiyeniz= " + hesap1.getAltinBakiye());
            }
            else if (secim.equals("2"))
            {
                System.out.print("Yatirmak Istediginiz Tutari Giriniz= ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap1.paraYatirma(miktar);
            }
            else if (secim.equals("3"))
            {
                System.out.print("Cekmek Istediginiz Tutari Giriniz= ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap1.paraCekme(miktar);
            }
            else if (secim.equals("4"))
            {
                String dovizIslemleri = "1-Dolar Satin Alma\n"
                        + "2-Dolar Bozdurma\n"
                        + "3-Euro Satin Alma\n"
                        + "4-Euro Bozdurma\n"
                        + "5-Altin Satin Alma\n"
                        + "6-Altin Bozdurma\n"
                        + "q-Doviz Islemlerinden Cikis Yapma\n"
                        + "Uygulamak Istediginiz Islemi Giriniz= ";
                
                System.out.println("\nDOVIZ ISLEMERI BOLUMU");
                             
                while (true)
                {
                    System.out.print(dovizIslemleri);
                    String dovizSecim = scanner.nextLine();
                    
                    if (dovizSecim.equals("1"))
                    {
                        System.out.println("Mevcut Dolar Kuru= " + HesapIslemleri.dolarKuru);
                        System.out.print("Satin Almak Istediginiz Dolar Miktarini Giriniz= ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        hesap1.dolarAlma(miktar);
                    }
                    else if (dovizSecim.equals("2"))
                    {
                        System.out.println("Mevcut Dolar Kuru= " + HesapIslemleri.dolarKuru);
                        System.out.print("Bozdurmak Istediginiz Dolar Miktarini Giriniz= ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        hesap1.dolarBozdurma(miktar);
                    }
                    else if (dovizSecim.equals("3"))
                    {
                        System.out.println("Mevcut Euro Kuru= " + HesapIslemleri.euroKuru);
                        System.out.print("Satin Almak Istediginiz Euro Miktarini Giriniz= ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        hesap1.euroAlma(miktar);
                    }
                    else if (dovizSecim.equals("4"))
                    {
                        System.out.println("Mevcut Euro Kuru= " + HesapIslemleri.euroKuru);
                        System.out.print("Bozdurmak Istediginiz Euro Miktarini Giriniz= ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        hesap1.euroBozdurma(miktar);
                    }
                    else if (dovizSecim.equals("5"))
                    {
                        System.out.println("Mevcut Altin (gr) Kuru= " + HesapIslemleri.altinKuru);
                        System.out.print("Satin Almak Istediginiz Altin (gr) Miktarini Giriniz= ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        hesap1.altinAlma(miktar);
                    }
                    else if (dovizSecim.equals("6"))
                    {
                        System.out.println("Mevcut Altin (gr) Kuru= " + HesapIslemleri.altinKuru);
                        System.out.print("Bozdurmak Istediginiz Altin (gr) Miktarini Giriniz= ");
                        int miktar = scanner.nextInt();
                        scanner.nextLine();
                        hesap1.altinBozdurma(miktar);
                    }
                    else if (dovizSecim.equals("q"))
                    {
                        System.out.println("Doviz Islemleri Bolumunden Cikis Yapiliyor...");
                        break; 
                    }
                    else 
                    {
                        System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz!");
                    }
                }
            }
            else if (secim.equals("q"))
            {
                System.out.println("Sistemden Cikis Yapiliyor...");
                break;
            }
            else 
            {
                System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz!");
            }
                  
        }
                      
    }
    
}
