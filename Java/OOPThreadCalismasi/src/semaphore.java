
import java.util.LinkedList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class semaphore {

    private Semaphore sm = new Semaphore(2);
    
    private final int calismaOrani = 1;
    LinkedList<Integer> calisma = new LinkedList<Integer>();
    
    public void calistirma(String isim)
    {
        
        try {
            sm.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(semaphore.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int calismaYuzdesi = 0;
        
        while (true)
        {
            
            
            if(calismaYuzdesi == 25)
            {
                sm.release();
                return;
                
            }

            for(int i=0;i<25;i++)
            {
                try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(semaphore.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                System.out.println(isim+ " Adli Calisan Calisiyor...");
                calisma.offer(calismaOrani);
                calismaYuzdesi++;
                System.out.println("Isin Bitme Yuzdesi :" + calisma.size());               
            }
            
        }
        
        
    }
    
    public boolean isBittiMi()
    {
        if (calisma.size() == 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
