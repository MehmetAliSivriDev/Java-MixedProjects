
public class Kare extends Sekil {
    
    private int kenar;
    
    public Kare (String isim, int kenar)
    {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        
        System.out.println(getIsim() + " Adli Sekilin Alani= " + (kenar*kenar));
    }

    @Override
    void cevreHesapla() {
        
        System.out.println(getIsim() + " Adli Sekilin Cevresi= " + (kenar * 4));
    }
    
    
    
}
