
public class Calisan {
    
    private String ad;
    private String soyad;
    private int id;
    private String kullaniciAdi;
    private String parola;
    
    public Calisan (String ad, String soyad, int id, String kullaniciAdi, String parola)
    {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void bilgileriGoster ()
    {
        System.out.println("Ad= " + ad);
        System.out.println("Soyad= " + soyad);
        System.out.println("Id= " + id);
    }
    
}
