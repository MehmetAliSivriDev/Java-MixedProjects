
public class Tasarımcı extends Aday {
    
    private String kullandigiProgramlar;
    private int maasBeklentisi;

    public Tasarımcı(String kullandigiProgramlar, int maasBeklentisi, String isim, int yas, String mezun, String askerlik, String isTecrubesi) {
        super(isim, yas, mezun, askerlik, isTecrubesi);
        this.kullandigiProgramlar = kullandigiProgramlar;
        this.maasBeklentisi = maasBeklentisi;
    }

    public String getKullandigiProgramlar() {
        return kullandigiProgramlar;
    }

    public void setKullandigiProgramlar(String kullandigiProgramlar) {
        this.kullandigiProgramlar = kullandigiProgramlar;
    }

    public int getMaasBeklentisi() {
        return maasBeklentisi;
    }

    public void setMaasBeklentisi(int maasBeklentisi) {
        this.maasBeklentisi = maasBeklentisi;
    }
    
    
    
}
