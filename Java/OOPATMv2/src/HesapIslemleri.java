
public class HesapIslemleri {

    private String kullaniciAdi;
    private String parola;
    private int tlBakiye;
    private int dolarBakiye;
    private int euroBakiye;
    private int altinBakiye;
    
    public static final double dolarKuru = 17.0;
    public static final double euroKuru = 18.0;
    public static final double altinKuru = 980.0;

    public void paraYatirma(int miktar)
    {
        tlBakiye += miktar;
        System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
    }
    
    public void paraCekme(int miktar)
    {
        if (miktar > 1500)
        {
            System.out.println("Bir Gunde En Fazla 1500tl Nakit Cekebilirsiniz!");
        }
        else if (miktar > tlBakiye)
        {
            System.out.println("Yetersiz Bakiye!");
        }
        else
        {
            tlBakiye -= miktar;
            System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
        }
    }
    
    public void dolarAlma(int miktar)
    {
       int temp = miktar; 
       temp *= dolarKuru;
       
       if (temp > tlBakiye)
       {
           System.out.println("Yetersiz Bakiye!\n"
                   + "Guncel Tl Bakiye= " + tlBakiye);
       }
       else
       {
           
        dolarBakiye += miktar;
        tlBakiye -= miktar * dolarKuru;
        
        System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Dolar Bakiye= " + dolarBakiye + "\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
       }
    }
    
    public void dolarBozdurma(int miktar)
    {
 
        if (miktar > dolarBakiye)
        {
            System.out.println("Yetersiz Bakiye\n"
                    + "Mevcut Dolar Bakiye= " + dolarBakiye);
        }
        else
        {
            dolarBakiye -= miktar;
            tlBakiye += miktar*dolarKuru;
            
            System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Dolar Bakiye= " + dolarBakiye + "\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
        }
    }
    
    public void euroAlma(int miktar)
    {
       int temp = miktar; 
       temp *= euroKuru;
       
       if (temp > tlBakiye)
       {
           System.out.println("Yetersiz Bakiye!\n"
                   + "Guncel Tl Bakiye= " + tlBakiye);
       }
       else
       {
           
        euroBakiye += miktar;
        tlBakiye -= miktar * euroKuru;
        
        System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Euro Bakiye= " + euroBakiye + "\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
       }
    }
    
    public void euroBozdurma(int miktar)
    {
 
        if (miktar > euroBakiye)
        {
            System.out.println("Yetersiz Bakiye\n"
                    + "Mevcut Euro Bakiye= " + euroBakiye);
        }
        else
        {
            euroBakiye -= miktar;
            tlBakiye += miktar*euroKuru;
            
            System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Euro Bakiye= " + euroBakiye + "\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
        }
    }
    
    public void altinAlma(int miktar)
    {
       int temp = miktar; 
       temp *= altinKuru;
       
       if (temp > tlBakiye)
       {
           System.out.println("Yetersiz Bakiye!\n"
                   + "Guncel Tl Bakiye= " + tlBakiye);
       }
       else
       {
           
        altinBakiye += miktar;
        tlBakiye -= miktar * altinKuru;
        
        System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Altin Bakiye= " + altinBakiye + "\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
       }
    }
    
    public void altinBozdurma(int miktar)
    {
 
        if (miktar > altinBakiye)
        {
            System.out.println("Yetersiz Bakiye\n"
                    + "Mevcut Altin Bakiye= " + altinBakiye);
        }
        else
        {
            altinBakiye -= miktar;
            tlBakiye += miktar*altinKuru;
            
            System.out.println("Isleminiz Basariyla Gerceklestirilmistir.\n"
                + "Guncel Altin Bakiye= " + altinBakiye + "\n"
                + "Guncel Tl Bakiye= " + tlBakiye);
        }
    }
    
    public HesapIslemleri(String kullaniciAdi, String parola, int tlBakiye, int dolarBakiye, int euroBakiye, int altinBakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.tlBakiye = tlBakiye;
        this.dolarBakiye = dolarBakiye;
        this.euroBakiye = euroBakiye;
        this.altinBakiye = altinBakiye;
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

    public int getTlBakiye() {
        return tlBakiye;
    }

    public void setTlBakiye(int tlBakiye) {
        this.tlBakiye = tlBakiye;
    }

    public int getDolarBakiye() {
        return dolarBakiye;
    }

    public void setDolarBakiye(int dolarBakiye) {
        this.dolarBakiye = dolarBakiye;
    }

    public int getEuroBakiye() {
        return euroBakiye;
    }

    public void setEuroBakiye(int euroBakiye) {
        this.euroBakiye = euroBakiye;
    }

    public int getAltinBakiye() {
        return altinBakiye;
    }

    public void setAltinBakiye(int altinBakiye) {
        this.altinBakiye = altinBakiye;
    }
    
    
            
           
    
}
