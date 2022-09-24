
import java.util.Scanner;


public class Kapılar {
        
    private boolean sagKapi = false;    
    private boolean solKapi = false;
    
    
    public void kapiAc()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mevcut Kapi Durumlari:");
        if (sagKapi == false)
        {
            System.out.println("Sag Kapi Kapali.");
        }
        else 
        {
            System.out.println("Sag Kapi Acik");
        }
        
        if (solKapi == false)
        {
            System.out.println("Sol Kapi Kapali.");
        }
        else 
        {
            System.out.println("Sol Kapi Acik");
        }
        
        System.out.print("Acmak Istediginiz Kapiyi Giriniz (sag,sol)= ");
        String kapiIslemi = scanner.nextLine();
        
        if (kapiIslemi.equals("sag"))
        {
            System.out.println("Sag Kapi Aciliyor...");
            sagKapi = true;
        }
        else if (kapiIslemi.equals("sol"))
        {
            System.out.println("Sol Kapi Aciliyor...");
            solKapi = true;
        }
        else
        {
            System.out.println("Hatali Giris Yaptiniz.");
        }
    }
    
    public void kapiKapat()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mevcut Kapi Durumlari:");
        if (sagKapi == false)
        {
            System.out.println("Sag Kapi Kapali.");
        }
        else 
        {
            System.out.println("Sag Kapi Acik");
        }
        
        if (solKapi == false)
        {
            System.out.println("Sol Kapi Kapali.");
        }
        else 
        {
            System.out.println("Sol Kapi Acik");
        }
        
        System.out.print("Kapatmak Istediginiz Kapiyi Giriniz (sag,sol)= ");
        String kapiIslemi = scanner.nextLine();
        
        if (kapiIslemi.equals("sag"))
        {
            System.out.println("Sag Kapi Kapatiliyor...");
            sagKapi = false;
        }
        else if (kapiIslemi.equals("sol"))
        {
            System.out.println("Sol Kapi Kapatiliyor...");
            solKapi = false;
        }
        else
        {
            System.out.println("Hatali Giris Yaptiniz.");
        }
    }
    
    public Kapılar() {
    }
    
    public boolean isSagKapi() {
        return sagKapi;
    }

    public void setSagKapi(boolean sagKapi) {
        this.sagKapi = sagKapi;
    }

    public boolean isSolKapi() {
        return solKapi;
    }

    public void setSolKapi(boolean solKapi) {
        this.solKapi = solKapi;
    }
    
    
    
}
