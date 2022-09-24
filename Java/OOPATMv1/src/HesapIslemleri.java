
public class HesapIslemleri {

    
    private String kullanici;
    private String parola;
    private int bakiye; 

    public HesapIslemleri (String kullanici, String parola, int bakiye)
    {
        this.kullanici = kullanici;
        this.parola = parola;
        this.bakiye = bakiye;
        
    }
    
    public void paraYatirma (int miktar)
    {
        bakiye += miktar;
        
        System.out.println("Guncel Bakiyeniz= " + bakiye);        
    }
    
    public void paraCekme (int miktar)
    {
        if (miktar > 1500)
        {
            System.out.println("Gun icerisinde 1500 TL'den fazla nakit para cekemezsiniz!");
        }
        if (miktar > bakiye)
        {
            System.out.println("Yetersiz Bakiye!\n Mevcu0t Bakiyeniz= " + bakiye);
        }
        else
        {
            bakiye -= miktar;
            System.out.println("Güncel Bakiyeniz= " + bakiye);
        }
        
    }
   
    
    /**
     * @return the kullanici
     */
    public String getKullanici() {
        return kullanici;
    }

    /**
     * @param kullanici the kullanici to set
     */
    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
}
