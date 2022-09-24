
public class KabulDurumu implements IKabulDurumu {
    
    public  boolean kabul (Aday aday)
    {
        if(aday.getYas() >= 18 && aday.getBoy() > 150 && aday.getBoy() < 200 && aday.getKilo() > 60 && aday.getKilo() < 100 
                && aday.isSicilDurumu() == true && aday.isEgitimDurumu() == true)
        {
            return true;
        }
        else
        {
            return false;
        }
            
        
        
    }
    
}
