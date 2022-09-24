
public class Dragon extends Beyblade {
    
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon( String beybladeci, int saldirigucu, int donushizi, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, saldirigucu, donushizi);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }
    
    public void bilgileriGoster()
    {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavarin Adi= " + kutsalCanavar);
        System.out.println("Gizli Yetenegi= " + gizliYetenek);
    }
    
    public void kutsalCanavarOrtayaCikar()
    {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'i ortaya cikiyor...");
        System.out.println(kutsalCanavar + "'in Gizli Yeteneği= Hayalet Kasirgasi");
    }
    
}
