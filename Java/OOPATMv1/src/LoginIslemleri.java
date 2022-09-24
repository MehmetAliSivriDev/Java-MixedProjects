
import java.util.Scanner;


public class LoginIslemleri {

    public boolean login (HesapIslemleri hesap1)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kullanici Adini Giriniz= ");
        String kullanici = scanner.nextLine();
        
        System.out.print("Kullanici Parolasini Giriniz= ");
        String parola = scanner.nextLine();
        
        if(hesap1.getKullanici().equals(kullanici) && hesap1.getParola().equals(parola))
        {
            return true;
        }
        return false;
    }
    
}
