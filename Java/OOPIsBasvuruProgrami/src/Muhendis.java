
public class Muhendis extends Aday{

    private String alan;
    private int maasBeklentisi;
    
    public Muhendis(String isim, int yas, String mezun, String askerlik, String isTecrubesi, String alan, int maasBeklentisi) {
        super(isim, yas, mezun, askerlik, isTecrubesi);
        this.alan = alan;
        this.maasBeklentisi = maasBeklentisi;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public int getMaasBeklentisi() {
        return maasBeklentisi;
    }

    public void setMaasBeklentisi(int maasBeklentisi) {
        this.maasBeklentisi = maasBeklentisi;
    }
    
    
    
    
    
}
