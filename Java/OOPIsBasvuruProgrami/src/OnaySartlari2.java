
public class OnaySartlari2 implements IBasvuruDurumu {

    @Override
    public boolean kabul(Aday aday) {
        
        //is tecrubesi aramiyor.
        
        if (aday.getYas() >= 18 && aday.getMezun().equals("evet") && aday.getAskerlik().equals("evet") && aday.getIsTecrubesi().equals("hayir"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
    
    
}
