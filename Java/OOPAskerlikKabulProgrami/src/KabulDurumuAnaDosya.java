
public class KabulDurumuAnaDosya {
    
    private IKabulDurumu ikabuldurumu;

    public KabulDurumuAnaDosya(IKabulDurumu ikabuldurumu) {
        this.ikabuldurumu = ikabuldurumu;
    }
    
    public void kayitKabul(Aday aday)
    {
        if(ikabuldurumu.kabul(aday) == true)
        {
            System.out.println("Kisi Askerlik Yapabilir.\nAskerlik Onaylanmistir.");

        }
        else 
        {
            System.out.println("Kisi Askerlik Yapamaz.\nAskerlik Onaylanmamistir.");

        }
    }
}
