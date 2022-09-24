
public class Fatma extends Insan {
    
    private String hobi;
    private String muzikZevki;

    public Fatma(String hobi, String muzikZevki, String adSoyad, String meslek, String memleket, int yas) {
        super(adSoyad, meslek, memleket, yas);
        this.hobi = hobi;
        this.muzikZevki = muzikZevki;
    }

    public void konustur()
    {
        super.konustur();
        System.out.println("Suanda Devam Ettirdigim Hobim :" + hobi);
        System.out.println("Dinlemeyi Sevdigim Muzik Turu :" + muzikZevki);
    }
    
    
    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getMuzikZevki() {
        return muzikZevki;
    }

    public void setMuzikZevki(String muzikZevki) {
        this.muzikZevki = muzikZevki;
    }
    
    
}
