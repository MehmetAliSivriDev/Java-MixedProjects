
public class Beyblade {
    
    private String beybladeci;
    private int saldirigucu;
    private int donushizi;

    public Beyblade(String beybladeci, int saldirigucu, int donushizi) {
        this.beybladeci = beybladeci;
        this.saldirigucu = saldirigucu;
        this.donushizi = donushizi;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getSaldirigucu() {
        return saldirigucu;
    }

    public void setSaldirigucu(int saldirigucu) {
        this.saldirigucu = saldirigucu;
    }

    public int getDonushizi() {
        return donushizi;
    }

    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }
  
    public void Saldir ()
    {
        System.out.println(beybladeci + " " + saldirigucu + " saldrigucu ile saldiriyor..."); 
    }
    
    public void kutsalCanavarOrtayaCikar()
    {
        System.out.println("Bu Beyblade'nin kutsal canavari bulunmuyor... ");
    }            
    
   public void bilgileriGoster()
   {
       System.out.println("Beybladecenin Adi= " + beybladeci);
       System.out.println("Beybladenin Saldiri Gucu= " + saldirigucu);
       System.out.println("Beybladenin Donus Hizi= " + donushizi);
   }
    
    
    
    
    
    
    
}


