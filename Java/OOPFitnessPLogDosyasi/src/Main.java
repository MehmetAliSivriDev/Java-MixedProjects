
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("******************************\n"
                + "Fitness Programina Hosgeldiniz!\n"
                + "******************************");
        
        System.out.println("Kayit Islemi");
        System.out.print("Adinizi Giriniz= ");
        String isim = scanner.nextLine();
        
        System.out.print("Kilonuzu Giriniz(kg)= ");
        double kilo = scanner.nextDouble();
        
        System.out.print("Boyunuzu Giriniz(m)= ");
        double boy = scanner.nextDouble();
        
        System.out.print("Sinav Hareketi Miktarini Girin= ");
        int sinav = scanner.nextInt();
        
        System.out.print("Mekik Hareketi Miktarini Girin= ");
        int mekik = scanner.nextInt();
        
        System.out.print("On Kol Hareketi Miktarini Girin= ");
        int onkol = scanner.nextInt();
        
        System.out.print("Arka Kol Hareketi Miktarini Girin= ");
        int arkakol = scanner.nextInt();
        
        System.out.print("Sirt Hareketi Miktarini Girin= ");
        int sirt = scanner.nextInt();
        
        System.out.print("Gogus Hareketi Miktarini Girin= ");
        int gogus = scanner.nextInt();
        
        System.out.print("Bacak Hareketi Miktarini Girin= ");
        int bacak = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Kayit Islemi Tamamlanmistir...\nProgram Olusturuluyor...");
        Fitness kisi = new Fitness(isim, sinav, mekik, onkol, arkakol, sirt, gogus, bacak);
        
        System.out.println("**************************************\n"
                         + "Kutle Beden Indeksi Bilgilendirmesi...");
        kisi.kbiHesaplama(kilo, boy);
        
        System.out.println("**************************************************\n"
                           + "Isim= " + isim + "\n"
                           + "Boy= "  + boy + "m" + "\n"
                           + "Kilo= " + kilo + "kg" + "\n"
                           + "Kutle Beden Indeksi= " + kisi.getKutle_beden_indeksi() + "\n"
                           + "Fitness Programina Hos Geldiniz Mevcut Programiniz\n"
                           + "**************************************************");
        
        try(FileWriter writer = new FileWriter("log.txt"))
        {
            writer.write(kisi.getIsim() + " Kisinin Fitness Programi :\n\n");
            writer.write("Sinav Hareketi Miktari= " + kisi.getSinav()+ "\n");
            writer.write("Mekik Hareketi Miktari= " + kisi.getMekik()+ "\n");
            writer.write("On Kol Hareketi Miktari= " + kisi.getOnkol() + "\n");
            writer.write("Arka Kol Hareketi Miktari= " + kisi.getArkakol() + "\n");
            writer.write("Sirt Hareketi Miktari= " + kisi.getSirt()+ "\n");
            writer.write("Gogus Hareketi Miktari= " + kisi.getGogus() + "\n");
            writer.write("Bacak Hareketi Miktari= " + kisi.getBacak() + "\n\n");
            
            int islem = 1;
            
            while (kisi.programbittimi() == false)
            {
                System.out.println("******************************");
                System.out.println("Kalan Sinav Hareketi Miktari= " + kisi.getSinav());
                System.out.println("Kalan Mekik Hareketi Miktari= " + kisi.getMekik());
                System.out.println("Kalan On Kol Hareketi Miktari= " + kisi.getOnkol());
                System.out.println("Kalan Arka Kol Hareketi Miktari= " + kisi.getArkakol());
                System.out.println("Kalan Sirt Hareketi Miktari= " + kisi.getSirt());
                System.out.println("Kalan Gogus Hareketi Miktari= " + kisi.getGogus());
                System.out.println("Kalan Bacak Hareketi Miktari= " + kisi.getBacak());
                System.out.println("******************************\n\n");

            
                System.out.print("Uygulamak Istediginiz Hareketi Giriniz(sinav,mekik,onkol,arkakol,sirt,gogus,bacak)= ");
                String tur = scanner.nextLine();
            
                System.out.print("Bu Hareketi Uygulayacaginiz Miktari Giriniz= ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                
                kisi.hareketYap(tur, sayi);
                
                writer.write(islem + ". Islem: " + tur + " Hareketi -->" + sayi + "\n");
                islem++;
            }
            System.out.println("Progamini Tamamladin Tebrikler!!");
        
    }   catch (IOException ex) {
            System.out.println("IOException Hatasi.");
        }
    }
    
}
