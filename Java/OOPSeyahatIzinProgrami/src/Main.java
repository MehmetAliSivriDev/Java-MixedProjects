
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seyahat Izin Programina Hos Geldiniz!");
        String gerekliIzinler = "Izin Alinmasi Gereken Islemler :\n"
                + "-Vize\n"
                + "-Yas\n"
                + "-Siyasi Yasak Kontrol\n"
                + "-Gerekli Harc Miktari\n";
        
        System.out.println(gerekliIzinler);
        

        while (true)
        {
            
            System.out.print("Ad ve Soyadiniz Giriniz= ");
            String adsoyad = scanner.nextLine();
        
            System.out.print("Seyahat Edeceginiz Bolgeyi Giriniz= ");
            String bolge = scanner.nextLine();
            
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("\nSeyahat Izni Icin Gerekli Yas Kontorl Ediliyor...");
            Thread.sleep(3000);
            yolcu.yasKontrol();
            System.out.println("");
            
            System.out.println("Seyahat Izni Icin Gerekli Harc Miktari Kontorl Ediliyor...");
            Thread.sleep(3000);
            yolcu.harcKontrol();
            System.out.println("");

            
            System.out.println("Seyahat Izni Icin Gerekli Yer Islemleri Kontorl Ediliyor...");
            Thread.sleep(3000);
            yolcu.yerKontrol();
            System.out.println("");
            
            System.out.println("Seyahat Izni Icin Gerekli Vize Evraklari Kontorl Ediliyor...");
            Thread.sleep(3000);
            yolcu.vizeKontrol();
            System.out.println("");
            
            System.out.println("Seyahat Izni Icin Gerekli Siyasi Yasak Islemleri Kontorl Ediliyor...");
            Thread.sleep(3000);
            yolcu.siyasiYasakKontrol();
            Thread.sleep(2000);
            
            System.out.println("\n\n");
            System.out.println("Kisi Bilgileri: ");
            System.out.println("Ad Soyad= " + adsoyad);
            System.out.println("Yas= " + yolcu.getYolcuyasi());
            System.out.println("Seyahat Edecegi Bolge= " + bolge); 
            System.out.println("\n");
            
            boolean izin = yolcu.isYas() && yolcu.isHarcMiktari() && yolcu.isYerIslemi() && yolcu.isVizeIslemi() && yolcu.isSiyasiYasakIslemi();
            
            if (izin == true)
            {
                System.out.println("\n\nSeyahat Izin Icin Gerekli Tum Islemler Tamamlanmistir Iyi Yolculuklar...");
                System.out.println("Seyahat Izni Verilmistir!!");
                System.out.println("Programdan Cikartiliyorsunuz...");
                break;
            }
            else 
            {
                System.out.println("\n\nSeyahat Izin Icin Gerekli Tum Islemler Tamamlanmamistir "
                        + "Eksik Islemler ve Izinler Bulunmaktadir Lutfen Tekrar Deneyiniz...");
                System.out.println("Seyahat Izni Verilmemistir!!\n");
                continue;
            }
        }
        
    }
    
    
}
