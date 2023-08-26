
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UreticiTuketici {
    
    Random r = new Random();
    
    BlockingQueue<Integer> sira = new ArrayBlockingQueue<Integer>(10);
    
    public void uret()
    {
        
        while(true)
        {
            try {
            Thread.sleep(1000);
            
            int value = r.nextInt(100);
            
            sira.put(value);
            
            System.out.println("Uretici Ekleme Islemi Gerceklestiriyor : " + value);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(UreticiTuketici.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    
    
    public void tuket()
    {
        
        while(true)
        {
            try {
            Thread.sleep(2000);
            
            int value = sira.take();
            
            
            System.out.println("Tuketici Alma Islemi Gerceklestiriyor : " + value);
            
            System.out.println("Queue Size : " + sira.size());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(UreticiTuketici.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
}



    
    
    
    

