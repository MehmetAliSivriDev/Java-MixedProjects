
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa Hos Geldiniz!");
        String islemler = "************************\n"
                + "Matematik Islemleri\n"
                + "************************\n"
                + "1-Karekok Hesaplama\n"
                + "2-Uslu Sayi Hesaplama\n"
                + "3-Asal Sayi Olup Olmadigini Kontrol Etme\n"
                + "************************\n"
                + "Fizik Islemleri\n"
                + "************************\n"
                + "4-Vektor Carpimi\n"
                + "************************\n"
                + "Geometri Islemleri\n"
                + "************************\n"
                + "5-Kare Alan Hesaplama\n"
                + "6-Kare Cevre Hesaplama\n"
                + "7-Ucgen Alan Hesaplama\n"
                + "8-Ucgen Cevre Hesaplama\n"
                + "************************\n"
                + "q-Progamdan Cikis Yap\n"
                + "************************\n"
                + "Uygulamak Istediginiz Islemi Girini= ";
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("q"))
            {
                System.out.println("Programdan Cikartiliyorsunuz...");
                break;
            }
            else if (islem.equals("1"))
            {
                System.out.print("Karekokunu Hesaplamak Istediginiz Sayiyi Giriniz= ");
                double karekok = scanner.nextDouble();
                scanner.nextLine();
                Islemler.Matematik.karekokBulma(karekok);
            }
            else if (islem.equals("2"))
            {
                System.out.print("Taban Sayiyi Giriniz= ");
                int taban = scanner.nextInt();
                System.out.print("Uslu sayiyi Giriniz= ");
                int uslu = scanner.nextInt();
                scanner.nextLine();
                Islemler.Matematik.usluHesaplama(taban, uslu);
            }
            else if (islem.equals("3"))
            {
                System.out.print("Asal Olup Olmadigini Kontrol Etmek Istediginiz Sayiyi Giriniz= ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                
                    if (Islemler.Matematik.asalKontrol(sayi) == true)
                    {
                        System.out.println(sayi + " Sayisi Asaldir!");
                    }
                    else
                    {
                        System.out.println(sayi + " Sayisi Asal Degildir!");
                    }
            }
            else if (islem.equals("4"))
            {
                Vec vec1 = new Vec("Vektor1");
                Vec vec2 = new Vec("Vektor2");
                Islemler.Fizik.vectorCarpimi(vec1, vec2);
            }
            else if (islem.equals("5"))
            {
                System.out.print("Bir Kenar Giriniz= ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                Islemler.Geometri.kareAlan(sayi);
            }
            else if (islem.equals("6"))
            {
                System.out.print("Bir Kenar Giriniz= ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                Islemler.Geometri.kareCevre(sayi);
            }
            else if (islem.equals("7"))
            {
                System.out.print("Ucgenin Birinci Kenarini Giriniz= ");
                int kenar1 = scanner.nextInt();
                
                System.out.print("Ucgenin Ikinci Kenarini Giriniz= ");
                int kenar2 = scanner.nextInt();
                
                System.out.print("Ucgenin Ucuncu Kenarini Giriniz= ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Islemler.Geometri.ucgenAlan(kenar1, kenar2, kenar3);
            }    
            else if (islem.equals("8"))
            {
                System.out.print("Ucgenin Birinci Kenarini Giriniz= ");
                int kenar1 = scanner.nextInt();
                
                System.out.print("Ucgenin Ikinci Kenarini Giriniz= ");
                int kenar2 = scanner.nextInt();
                
                System.out.print("Ucgenin Ucuncu Kenarini Giriniz= ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Islemler.Geometri.ucgenCevre(kenar1, kenar2, kenar3);
            }
            
        }
                    
        
        
        
        
    }
    
}
