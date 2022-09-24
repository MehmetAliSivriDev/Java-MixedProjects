
public class Kitap {
    
    private int id;
    private String kitapAdi;
    private String yazar;
    private String yayinEvi;
    private int sayfaSayisi;

    public Kitap(int id, String kitapAdi, String yazar, String yayinEvi, int sayfaSayisi) {
        this.id = id;
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.yayinEvi = yayinEvi;
        this.sayfaSayisi = sayfaSayisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    
    
}
