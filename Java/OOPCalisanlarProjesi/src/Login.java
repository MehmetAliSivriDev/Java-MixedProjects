
import java.util.Scanner;


public class Login {
    
    public boolean login (Yazilimci y1)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kullanici Adinizi Giriniz= ");
        String kullanici = scanner.nextLine();
        
        System.out.print("Kullanici Parolanizi Giriniz= ");
        String parola = scanner.nextLine();
        
        if(y1.getKullaniciAdi().equals(kullanici) && y1.getParola().equals(parola))
        {
            return true;
        }
        return false;
    }
    
    public boolean login (Yonetici yonetici)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kullanici Adinizi Giriniz= ");
        String kullanici = scanner.nextLine();
        
        System.out.print("Kullanici Parolanizi Giriniz= ");
        String parola = scanner.nextLine();
        
        if(yonetici.getKullaniciAdi().equals(kullanici) && yonetici.getParola().equals(parola))
        {
            return true;
        }
        return false;
    }
        
    }
            
    
   
