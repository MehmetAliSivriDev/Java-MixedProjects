
import java.util.Scanner;

class vizeException extends Exception
{

    @Override
    public void printStackTrace() {
        
        System.out.println("Vize Islemleri Tamamlanamamistir.\n"
                    + "Seyahat Izni Verilmemistir.");
    }
    
}

class harcException extends Exception
{
    
    @Override
    public void printStackTrace() {
        
        System.out.println("Gerekli Harc Miktari Yatirilmamistir.\n"
                    + "Seyahat Izni Verilmemistir.");
    }
    
}

class siyasiException extends Exception
{
    @Override
    public void printStackTrace() {
        
        System.out.println("Siyasi Yasak Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmemistir.");
    }
}

class yasException extends Exception
{
    @Override
    public void printStackTrace() {
        
        System.out.println("Yolcu Seyahat Icin Uygun Yasa Sahip Degil.\n"
                    + "Seyahat Izni Verilmemistir.");
    }
}

class yerException extends Exception
{
    public void printStackTrace() {
        
        System.out.println("Seyahat Yer Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmemistir.");
    }
}

public class Yolcu {

    private boolean vizeIslemi;
    private boolean harcMiktari;
    private boolean siyasiYasakIslemi;
    private boolean yas;
    private boolean yerIslemi;
    private int yolcuyasi;
    
    public Yolcu ()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yasinizi Giriniz= ");
        yolcuyasi = scanner.nextInt();
        scanner.nextLine();
        
        if (yolcuyasi >= 18)
        {
            this.yas = true;
        }
        else
        {
            this.yas = false;
        }
        
        System.out.print("Vize Evraklariniz Bulunuyor Mu?(evet ya da hayir)= ");
        String vize = scanner.nextLine();
        
        if (vize.equals("evet"))
        {
            this.vizeIslemi = true;
        }
        else
        {
            this.vizeIslemi = false;
        }
        
        System.out.print("Yatirdiginiz Harc Miktarini Giriniz= ");
        int harc = scanner.nextInt();
        scanner.nextLine();
        
        if (harc >= 15)
        {
            this.harcMiktari = true;
        }
        else
        {
            this.harcMiktari = false;
        }

        
        System.out.print("Herhangi Bir Siyasi Yasaginiz Bulunuyor Mu?(evet ya da hayir)= ");
        String siyasiy = scanner.nextLine();
        
        if (siyasiy.equals("hayir"))
        {
            this.siyasiYasakIslemi = true;
        }
        else
        {
            this.siyasiYasakIslemi = false;
        }
        
        System.out.print("Seyahat Suresince Kalacaginiz Yeri Ayarladiniz Mi?(evet ya da hayir)= ");
        String yer = scanner.nextLine(); 
        
        if (yer.equals("evet"))
        {
            this.yerIslemi = true;
        }
        else 
        {
            this.yerIslemi = false;
        }

    }
    
    
    
    
    public void vizeKontrol() throws vizeException {
        
        if (vizeIslemi == true)
        {
            System.out.println("Vize Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmistir.");
        }
        else
        {
            throw new vizeException();
        }
                    
        
        
    }

    public void harcKontrol() throws harcException {
        
        if (harcMiktari == true)
        {
            System.out.println("Gerekli Harc Miktari Yatirilmistir.\n"
                    + "Seyahat Izni Verilmistir.");
            
        }
        else
        {
            throw new harcException();
            
        }
        
    }

    public void siyasiYasakKontrol() throws siyasiException {
        
        if (siyasiYasakIslemi == true)
        {
            System.out.println("Siyasi Yasak Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmistir.");
            
        }
        else
        {
            throw new siyasiException();
           
        }
    }

    public void yasKontrol() throws yasException {
        
        if (yas == true)
        {
            System.out.println("Yolcu Seyahat Icin Uygun Yasa Sahip.\n"
                    + "Seyahat Izni Verilmistir.");
            
        }
        else
        {
            throw new yasException();
            
        }
    }

    public void yerKontrol() throws yerException {
        
        if (yerIslemi == true)
        {
            System.out.println("Seyahat Yer Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmistir.");
            
        }
        else
        {
            throw new yerException();
            
        }
        
    }

    public int getYolcuyasi() {
        return yolcuyasi;
    }

    public void setYolcuyasi(int yolcuyasi) {
        this.yolcuyasi = yolcuyasi;
    }

    public boolean isVizeIslemi() {
        return vizeIslemi;
    }

    public void setVizeIslemi(boolean vizeIslemi) {
        this.vizeIslemi = vizeIslemi;
    }

    public boolean isHarcMiktari() {
        return harcMiktari;
    }

    public void setHarcMiktari(boolean harcMiktari) {
        this.harcMiktari = harcMiktari;
    }

    public boolean isSiyasiYasakIslemi() {
        return siyasiYasakIslemi;
    }

    public void setSiyasiYasakIslemi(boolean siyasiYasakIslemi) {
        this.siyasiYasakIslemi = siyasiYasakIslemi;
    }

    public boolean isYas() {
        return yas;
    }

    public void setYas(boolean yas) {
        this.yas = yas;
    }

    public boolean isYerIslemi() {
        return yerIslemi;
    }

    public void setYerIslemi(boolean yerIslemi) {
        this.yerIslemi = yerIslemi;
    }

}
