
public class Aday {
    
    private String isim; 
    private int yas;
    private String mezun;
    private String askerlik;
    private String isTecrubesi;

    public Aday(String isim, int yas, String mezun, String askerlik, String isTecrubesi) {
        this.isim = isim;
        this.yas = yas;
        this.mezun = mezun;
        this.askerlik = askerlik;
        this.isTecrubesi = isTecrubesi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getMezun() {
        return mezun;
    }

    public void setMezun(String mezun) {
        this.mezun = mezun;
    }

    public String getAskerlik() {
        return askerlik;
    }

    public void setAskerlik(String askerlik) {
        this.askerlik = askerlik;
    }

    public String getIsTecrubesi() {
        return isTecrubesi;
    }

    public void setIsTecrubesi(String isTecrubesi) {
        this.isTecrubesi = isTecrubesi;
    }
    
    
}
