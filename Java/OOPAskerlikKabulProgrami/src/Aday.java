
public class Aday {

   private String adsoyad;
   private int yas;
   private double kilo;
   private double boy;
   private boolean sicilDurumu;
   private boolean egitimDurumu;

    public Aday(String adsoyad, int yas, double kilo, double boy, boolean sicilDurumu, boolean egitimDurumu) {
        this.adsoyad = adsoyad;
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
        this.sicilDurumu = sicilDurumu;
        this.egitimDurumu = egitimDurumu;
    }

   
   
    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public boolean isSicilDurumu() {
        return sicilDurumu;
    }

    public void setSicilDurumu(boolean sicilDurumu) {
        this.sicilDurumu = sicilDurumu;
    }

    public boolean isEgitimDurumu() {
        return egitimDurumu;
    }

    public void setEgitimDurumu(boolean egitimDurumu) {
        this.egitimDurumu = egitimDurumu;
    }
   
    public String egitimDurumu (boolean egitim)
    {
        if (egitim == true)
        {
            return "Egitim Gormuyor";
        }
        else
        {
            return "Egitim Goruyor";
        }
    }
    
    public String sicilDurumu (boolean sicil)
    {
        if (sicil == true)
        {
            return "Temiz";
        }
        else
        {
           return "Sabikali";
        }
    }
    
   
    
    
    
}
