
public class OnaySartlari1 implements IBasvuruDurumu{

    @Override
    public boolean kabul(Aday aday) {
        
        if (aday.getYas() >= 18 && aday.getMezun().equals("evet") && aday.getAskerlik().equals("evet") && aday.getIsTecrubesi().equals("evet"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
        
    
}
