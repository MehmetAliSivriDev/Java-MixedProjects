
public class Daire extends Sekil {
    
    private double yaricap;

    public Daire(String isim, double yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    
    
    @Override
    void alanHesapla() {
        
        System.out.println(getIsim() + " Adli Sekilin Alani= " + (Math.PI * (yaricap * yaricap)));
        
    }

    @Override
    void cevreHesapla() {
        
        System.out.println(getIsim() + " Adli Sekilin Cevresi= " + (2 * Math.PI * yaricap)); 
               
    }
    
    
    
}
