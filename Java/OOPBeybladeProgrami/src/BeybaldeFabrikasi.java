
public class BeybaldeFabrikasi {
    
    public Beyblade beybladeUret (String tur) 
    {   
            if (tur.equals("Dranza"))
            {
                return new Dranza("Kai", 600, 400, "Kirmizi Anka Kusu");
            }
            else if (tur.equals("Drayga"))
            {
                return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
            }
            else if (tur.equals("Dragon"))
            {
                return new Dragon("Takao", 800, 300, "Mavi Ejdarha", "Kutsal Canavarla Konusma");
            }
            else
            {
                return null;
            }

    }
    
}
