
import java.util.Scanner;


public class LoginIslemleri {
    
    public boolean login (AdminHesap hesap1)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kullanici Adinizi Giriniz= ");
        String kullanici = scanner.nextLine();
        
        System.out.print("Parolanizi Giriniz= ");
        String adminParola = scanner.nextLine();
        
        if (hesap1.getKullaniciAdi().equals(kullanici) && hesap1.getParola().equals(adminParola))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
}
