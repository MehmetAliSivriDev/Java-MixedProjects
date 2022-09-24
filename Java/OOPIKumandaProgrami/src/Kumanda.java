
import java.util.ArrayList;
import java.util.Iterator;


public class Kumanda implements Iterable<String> {

    
    class KumandaIterator implements Iterator<String>
    {
        
        private int index = 0;

        @Override
        public boolean hasNext() {
            
            if (index < kanallar.size())
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public String next() {
            
            String kanal = kanallar.get(index);
            index++;
            return kanal;
        }
 
    }
    
    
    private ArrayList<String> kanallar = new ArrayList<String>();
    
    public void kanalEkle (String kanal)
    {
        kanallar.add(kanal);
        System.out.println(kanal + " Adli Kanal Eklendi.");
    }
    
    public void kanalSil (String kanal)
    {
        if (kanallar.contains(kanal))
        {
            kanallar.remove(kanal);
            System.out.println(kanal + " Adli Kanal Silindi.");
        }
        else
        {
            System.out.println("Boyle Bir kanal Bulunamadi.");
        }
    }
    
    public int kanalSayisi ()
    {
        return kanallar.size();
    }

    @Override
    public Iterator<String> iterator() {
        
        return new KumandaIterator();
    }
    
    
}
