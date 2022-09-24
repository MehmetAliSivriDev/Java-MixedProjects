
import java.util.Scanner;


public class Main {
    
     public static void main(String[] args) throws InterruptedException {
       
        BasvuruOnayAnaSayfa onay = new BasvuruOnayAnaSayfa(new OnaySartlari1());

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Is Basvuru Programina Hos Geldiniz!");
         System.out.println("***********************************\n");
         
         System.out.print("Adinizi Ve Soyadinizi Giriniz= ");
         String adSoyad = scanner.nextLine();
         
         System.out.print("Yasinizi Giriniz= ");
         int yas = scanner.nextInt();
         scanner.nextLine();
         
         System.out.print("Universiteden Mezun Oldunuz Mu?(evet ya da hayir)= ");
         String mezun = scanner.nextLine();
         
         System.out.print("Askerliginizi Yaptiniz Mi(evet ya da hayir)= ");
         String askerlik = scanner.nextLine();
                 
         System.out.print("Herhangi Bir Is Deneyiminiz Oldu Mu?(evet ya da hayir)= ");
         String isTecrubesi = scanner.nextLine();
         
         Aday aday = new Aday(adSoyad, yas, mezun, askerlik, isTecrubesi);
         
         System.out.print("Basvurdugunuz Alan Nedir?(muhendislik ya da tasarimci)=");
         String alan = scanner.nextLine();
         
         if (alan.equals("muhendislik"))
         {
            System.out.print("Muhendislik Alaniniz Nedir?= ");
            String muhendislikAlani = scanner.nextLine();
                 
            System.out.print("Maas Beklentiniz Nedir?= ");
            int maas = scanner.nextInt();
            scanner.nextLine();
            
            Muhendis muhendis = new Muhendis(adSoyad, yas, mezun, askerlik, isTecrubesi, muhendislikAlani, maas);
            
            System.out.println("Basvuru Kaydiniz Alinmistir.");
             
            System.out.println("Basvuran Adayin Genel Bilgileri :");
            System.out.println("Adi Soyadi= " + aday.getIsim());
            System.out.println("Yasi= " + aday.getYas());
            System.out.println("Mezuniyet Durumu= " + aday.getMezun());
            System.out.println("Askerlik Durumu= " + aday.getAskerlik());
            System.out.println("Is Tecrubesi Durumu= " + aday.getIsTecrubesi());
            System.out.println("Muhendislik Alani= " + muhendis.getAlan());
            System.out.println("Maas Beklentisi= " + muhendis.getMaasBeklentisi());
             
            System.out.println("");
             
            System.out.println("Basvuru Degerlendiriliyor...");
            Thread.sleep(3000);
             
            onay.kayitKabul(aday);
             
         }
         else if (alan.equals("tasarimci"))
         {
            System.out.print("Kullandiginiz Tasarim Programlari Nelerdir?= ");
            String tasarimciAlani = scanner.nextLine();
                 
            System.out.print("Maas Beklentiniz Nedir?= ");
            int maas = scanner.nextInt();
            scanner.nextLine();
            
            Tasarımcı tasarimci = new Tasarımcı(tasarimciAlani, maas, adSoyad, yas, mezun, askerlik, isTecrubesi);
            
            System.out.println("Basvuru Kaydiniz Alinmistir.");
             
            System.out.println("Basvuran Adayin Genel Bilgileri :");
            System.out.println("Adi Soyadi= " + aday.getIsim());
            System.out.println("Yasi= " + aday.getYas());
            System.out.println("Mezuniyet Durumu= " + aday.getMezun());
            System.out.println("Askerlik Durumu= " + aday.getAskerlik());
            System.out.println("Is Tecrubesi Durumu= " + aday.getIsTecrubesi());
            System.out.println("Kullandigi Tasarim Programlari= " + tasarimci.getKullandigiProgramlar());
            System.out.println("Maas Beklentisi= " + tasarimci.getMaasBeklentisi());
             
            System.out.println("");
             
            System.out.println("Basvuru Degerlendiriliyor...");
            Thread.sleep(3000);
             
            onay.kayitKabul(aday);
         }
         else
         {
             System.out.println("Hatali Alan Girisi Yaptiniz Lutfen Formu Tekrar Doldurunuz.");
         }
         
         
                 
             
         
    }
}
