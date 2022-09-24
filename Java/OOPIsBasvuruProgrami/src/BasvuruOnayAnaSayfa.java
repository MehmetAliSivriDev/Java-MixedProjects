
public class BasvuruOnayAnaSayfa {

    private IBasvuruDurumu iBasvuruDurumu;

    public BasvuruOnayAnaSayfa(IBasvuruDurumu iBasvuruDurumu) {
        this.iBasvuruDurumu = iBasvuruDurumu;
    }
    
    public void kayitKabul (Aday aday)
    {
        if (iBasvuruDurumu.kabul(aday) == true)
        {
            System.out.println(aday.getIsim() + " Adli Adayin Is Basvurusu Kabul Edilmistir.");
        }
        else
        {
            System.out.println(aday.getIsim() + " Adli Adayin Is Basvurusu Kabul Edilmemistir.");
        }
                  
    }
    
}
