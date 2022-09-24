
public class Hasta implements Comparable<Hasta> {
    
    private String isim;
    private String sikayet;
    private int oncelik;
    
    public Hasta (String isim, String sikayet)
    {
        this.isim = isim;
        this.sikayet = sikayet;
                
        if (sikayet.equals("Karin Agrisi"))
        {
            oncelik = 1;
        }
        else if (sikayet.equals("Mide Yanmasi"))
        {
            oncelik = 2;
        }
        else if (sikayet.equals("Kanser"))
        {
            oncelik = 3;
        }

    }

    @Override
    public String toString() {
        
        return    "Hasta Adi= " + isim + "\n"
                + "Sikayeti= " + sikayet + "\n"
                + "Sikayet Onceligi= " + oncelik + "\n";        
    }

    @Override
    public int compareTo(Hasta hasta) {
        
        if (this.oncelik > hasta.oncelik)
        {
            return -1;
        }
        else if (this.oncelik < hasta.oncelik)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
}
