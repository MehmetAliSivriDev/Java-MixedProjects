
public class Dranza extends Beyblade {
    
    public String kutsalCanavar;
    
    public Dranza  (String beybladeci, int saldirigucu, int donushizi, String kutsalCanavar)
    {
        super(beybladeci, saldirigucu, donushizi);
        this.kutsalCanavar = kutsalCanavar;
    }
    
    public void bilgileriGoster()
    {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavarin Adi= " + kutsalCanavar);
    }
    
    public void kutsalCanavarOrtayaCikar()
    {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'i ortaya cikiyor...");
        System.out.println(kutsalCanavar + "'in Gizli Yeteneği= Alev Kilici");
    }
    
}
