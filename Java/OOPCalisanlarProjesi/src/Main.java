
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String girisIslemleri = "1-Yazilimci Islemleri\n"
                + "2-Yonetici Islemleri\n"
                + "q-Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        System.out.println("********************************");
        System.out.println("Programa HosGeldiniz");
        System.out.println("*********************************");
        
        while (true)
        {
            System.out.print(girisIslemleri);
            String islem = scanner.nextLine();
            
            if (islem.equals("q"))
            {
                System.out.println("Programdan Cikis Yapiliyor...");
                break;
            }
            else if (islem.equals("1"))
            {   
                Yazilimci y1 = new Yazilimci("Mehmet Ali", "SIVRI", 1, "admin", "1234", "C-C#-Java", 10000);
                Login login = new Login();
                
                System.out.println("**************************************");
                System.out.println("Kullanici Giris Paneli");
                System.out.println("**************************************");
                
                int hak = 3;
                
                while (true)
                {
                    if(login.login(y1))
                    {
                        System.out.println("Giris Basarili!");
                        System.out.println("Hosgeldiniz " + y1.getAd() + " " + y1.getSoyad());
                        System.out.println("Yazilimci Islemlerine Yonlendiriliyorsunuz...");
                        break;
                    }
                    else
                    {
                        hak -=1;
                        System.out.println("Yanlis Giris Yaptiniz Lutfen Tekrar Deneyiniz Kalan Hak= " + hak);
                        
                        if (hak == 0)
                        {
                            System.out.println("Giris Hakkınız Tükendi Sistemden Cikariliyorsunuz...");
                            System.exit(0);
                        }
                    }
                }
                
                String yazilimciIslemleri = "1-Format At\n"
                        + "2-Proje Sunma\n"
                        + "3-Zam Talebinde Bulunma\n"
                        + "4-Yazilimcinin Bilgilerini Gosterme\n"
                        + "q-Cikis Yapma\n"
                        + "Uygulamak Istediginiz Islemi Giriniz= ";
                
                while (true)
                {
                    System.out.print(yazilimciIslemleri);
                    String yazilimciIslemi = scanner.nextLine();
                    
                    if (yazilimciIslemi.equals("q"))
                    {
                        System.out.println("Yazilimci Islemlerinden Cikariliyorsunuz...");
                        break;
                    }
                    else if (yazilimciIslemi.equals("1"))
                    {
                        System.out.print("Format Atmak Istediginiz Isletim  Sistemini Giriniz= ");
                        String isletim_sistemi = scanner.nextLine();   
                        y1.FormatAt(isletim_sistemi);
                    }
                    else if (yazilimciIslemi.equals("2"))
                    {
                        System.out.print("Sunmak Istediginiz Konuyu Giriniz= ");
                        String konu = scanner.nextLine();
                        y1.projeSunma(konu);
                    }
                    else if (yazilimciIslemi.equals("3"))
                    {
                        System.out.print("Yoneticiden Taleb Ettiginiz Zam Miktarini Giriniz= ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        y1.zamTalebi(zamMiktari);
                    }
                    else if (yazilimciIslemi.equals("4"))
                    {
                        y1.bilgileriGoster();
                    } 
                }     
            }
            else if (islem.equals("2"))  
            {
                Yonetici yonetici = new Yonetici("Huseyin", "SIVRI", 2, "yonetici", "1234", 10);
                Login login = new Login();
                
                System.out.println("**************************************");
                System.out.println("Kullanici Giris Paneli");
                System.out.println("**************************************");
                
                int hak = 3;
                
                while (true)
                {
                    if(login.login(yonetici))
                    {
                        System.out.println("Giris Basarili!");
                        System.out.println("Hosgeldiniz " + yonetici.getAd() + " " + yonetici.getSoyad());
                        System.out.println("Yazilimci Islemlerine Yonlendiriliyorsunuz...");
                        break;
                    }
                    else
                    {
                        hak -=1;
                        System.out.println("Yanlis Giris Yaptiniz Lutfen Tekrar Deneyiniz Kalan Hak= " + hak);
                        
                        if (hak == 0)
                        {
                            System.out.println("Giris Hakkınız Tükendi Sistemden Cikariliyorsunuz...");
                            System.exit(0);
                        }
                    }
                }
                
                String yoneticiIslemleri = "1-Tatil Ilan Etme\n"
                        + "2-Zam Yapma\n"
                        + "3-Yonetici Bilgilerini Gosterme\n"
                        + "q-Cikis Yapma\n"
                        + "Uygulamak Istediginiz Islemi Giriniz= ";
                
                while (true)
                {
                    System.out.print(yoneticiIslemleri);
                    String yoneticiIslemi = scanner.nextLine();
                    
                    if (yoneticiIslemi.equals("q"))
                    {
                        System.out.println("Yonetici Islemlerinden Cikartiliyorsunuz...");
                        break;
                    }
                    else if (yoneticiIslemi.equals("1"))
                    {
                        System.out.print("Tatil Etmek Istediginiz Tarihi Giriniz(18.03.2002)= ");
                        String tarih = scanner.nextLine();
                        yonetici.tatilIlani(tarih);
                    }
                    else if (yoneticiIslemi.equals("2"))
                    {
                        System.out.print("Calisanlariniza Yapmak Istediginiz Zam Miktarini Giriniz= ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if (yoneticiIslemi.equals("3"))
                    {
                        yonetici.bilgileriGoster();
                    }
                           
                }
                
            }
        }
        
    }
        
}
