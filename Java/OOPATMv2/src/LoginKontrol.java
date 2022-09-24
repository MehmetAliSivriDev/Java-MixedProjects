
import java.util.Scanner;


public class LoginKontrol {

    public boolean loginIslemi(HesapIslemleri hesap1)    
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kullanici Adinizi Giriniz= ");
        String kullanici = scanner.nextLine();
        
        System.out.print("Parola Giriniz= ");
        String sifre = scanner.nextLine();
        
        if (hesap1.getKullaniciAdi().equals(kullanici) && hesap1.getParola().equals(sifre))
        {
            return true;
        }
        else 
        {
            return false;
        }        
    }
    
}
