
import java.util.Scanner;


public class Farlar {
    
    private boolean onFar = false;
    private boolean arkaFar = false;
    
    public void farAc()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mevcut Far Durumlari:");
        
        if(onFar == false)
        {
            System.out.println("On Farlar Kapali.");
        }
        else
        {
            System.out.println("On Farlar Acik.");
        }
        
        if (arkaFar == false)
        {
            System.out.println("Arka Farlar Kapali.");   
        }
        else
        {
            System.out.println("Arka Farlar Acik.");
        }
        
        System.out.print("Acmak Istediginiz Farlari Giriniz(on,arka)= ");
        String farIslemi = scanner.nextLine();
        
        if (farIslemi.equals("on"))
        {
            System.out.println("On Farlar Aciliyor...");
            onFar = true;
        }
        else if (farIslemi.equals("arka"))
        {
            System.out.println("Arka Farlar Aciliyor...");
            arkaFar = true;
        }
        else
        {
            System.out.println("Hatali Giris Yaptiniz!");
        }
    }
    
    public void farKapat()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mevcut Far Durumlari:");
        
        if(onFar == false)
        {
            System.out.println("On Farlar Kapali.");
        }
        else
        {
            System.out.println("On Farlar Acik.");
        }
        
        if (arkaFar == false)
        {
            System.out.println("Arka Farlar Kapali.");   
        }
        else
        {
            System.out.println("Arka Farlar Acik.");
        }
        
        System.out.print("Kapatmak Istediginiz Farlari Giriniz(on,arka)= ");
        String farIslemi = scanner.nextLine();
        
        if (farIslemi.equals("on"))
        {
            System.out.println("On Farlar Kapatiliyor...");
            onFar = false;
        }
        else if (farIslemi.equals("arka"))
        {
            System.out.println("Arka Farlar Kapatiliyor...");
            arkaFar = false;
        }
        else
        {
            System.out.println("Hatali Giris Yaptiniz!");
        }
    }

    public Farlar() {
    }

    public boolean isOnFar() {
        return onFar;
    }

    public void setOnFar(boolean onFar) {
        this.onFar = onFar;
    }

    public boolean isArkaFar() {
        return arkaFar;
    }

    public void setArkaFar(boolean arkaFar) {
        this.arkaFar = arkaFar;
    }
    
    
}
