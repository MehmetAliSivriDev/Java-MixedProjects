
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        KabulDurumuAnaDosya kabuledilme = new KabulDurumuAnaDosya(new KabulDurumu());
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Askerlik Kabul Programi");
        
        System.out.print("Adinizi ve Soyadinizi Giriniz= ");
        String adsoyad = scanner.nextLine();
        
        System.out.print("Yasinizi Giriniz= ");
        int yas = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Kilonuzu Giriniz(kg)= ");
        double kilo = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Boyunuzu Giriniz(cm)= ");
        double boy = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Herhangi Bir Adli Sicil Kaydiniz Var Mi?(evet ya da hayir)= ");
        String adlisicil = scanner.nextLine();
        boolean sicil;
        
        if (adlisicil.equals("hayir"))
        {
           sicil = true;
        }
        else 
        {
            sicil = false;
        }
        
        System.out.print("Ogrenim Goruyor Musunuz?(evet ya da hayir)= ");
        String ogrenim = scanner.nextLine();
        boolean egitim;
        
        if (ogrenim.equals("hayir"))
        {
            egitim = true;
        }
        else 
        {
            egitim = false;
        }
             
        Aday aday = new Aday(adsoyad, yas, kilo, boy, sicil, egitim);
        
        System.out.println("Aday Bilgileri:");
        System.out.println("Adi Soyadi= " + adsoyad);
        System.out.println("Yas= " + yas);
        System.out.println("Kilo= " + kilo);
        System.out.println("Boy= " + boy);
        System.out.println("Sicil Durumu= " + aday.sicilDurumu(sicil));
        System.out.println("Egitim Durumu= " + aday.egitimDurumu(egitim));
        System.out.println("");
        
        kabuledilme.kayitKabul(aday);
        
        
        
    }

    
}
