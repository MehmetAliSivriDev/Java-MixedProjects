
public class Insan {

    private String adSoyad;
    private String meslek;
    private String memleket;
    private int yas;

    public Insan(String adSoyad, String meslek, String memleket, int yas) {
        this.adSoyad = adSoyad;
        this.meslek = meslek;
        this.memleket = memleket;
        this.yas = yas;
    }
 
    public void konustur()
    {
        System.out.println("Merhaba! Adim ve Soyadim :" + adSoyad);
        System.out.println("Memleketim :" + memleket);
        System.out.println("Meslegim :" + meslek);
        System.out.println("Yasim :" + yas);
    }
    
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    
    
    
}
