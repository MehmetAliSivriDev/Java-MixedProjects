
import java.util.Scanner;


public class Yolcu implements IYolcu {

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
    
    
    
    
    @Override
    public boolean vizeKontrol() {
        
        if (vizeIslemi == true)
        {
            System.out.println("Vize Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmistir.");
            return true;
        }
        else
        {
            System.out.println("Vize Islemleri Tamamlanamamistir.\n"
                    + "Seyahat Izni Verilmemistir.");
            return false;
        }
                    
        
        
    }

    @Override
    public boolean harcKontrol() {
        
        if (harcMiktari == true)
        {
            System.out.println("Gerekli Harc Miktari Yatirilmistir.\n"
                    + "Seyahat Izni Verilmistir.");
            return true;
        }
        else
        {
            System.out.println("Gerekli Harc Miktari Yatirilmamistir.\n"
                    + "Seyahat Izni Verilmemistir.");
            return false;
        }
        
    }

    @Override
    public boolean siyasiYasakKontrol() {
        
        if (siyasiYasakIslemi == true)
        {
            System.out.println("Siyasi Yasak Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmistir.");
            return true;
        }
        else
        {
            System.out.println("Siyasi Yasak Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmemistir.");
            return false;
        }
    }

    @Override
    public boolean yasKontrol() {
        
        if (yas == true)
        {
            System.out.println("Yolcu Seyahat Icin Uygun Yasa Sahip.\n"
                    + "Seyahat Izni Verilmistir.");
            return true;
        }
        else
        {
            System.out.println("Yolcu Seyahat Icin Uygun Yasa Sahip Degil.\n"
                    + "Seyahat Izni Verilmemistir.");
            return false;
        }
    }

    @Override
    public boolean yerKontrol() {
        
        if (yerIslemi == true)
        {
            System.out.println("Seyahat Yer Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmistir.");
            return true;
        }
        else
        {
            System.out.println("Seyahat Yer Kontrol Islemleri Tamamlanmistir.\n"
                    + "Seyahat Izni Verilmemistir.");
            return false;
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
