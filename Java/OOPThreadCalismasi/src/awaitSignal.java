
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class awaitSignal {
    
    ArrayList<Integer> ekmek = new ArrayList<Integer>();
    
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    
    private final int ekmekAtmaOrani = 1;
    
    public void birinciFirinci()
    {
        lock.lock();
        
        for (int i=0;i<25;i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(awaitSignal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Birinci Firinci Firina Ekmek Atiyor...");
            ekmek.add(ekmekAtmaOrani);
            System.out.println("Firindaki Mevcut Ekmek Sayisi :" + ekmek.size());
        }
        
        condition.signal();
        lock.unlock();
        
    }
    
    public void ikinciFirinci()
    {
        try {
            Thread.sleep(1000);
            
            lock.lock();
        
        for (int i=0;i<25;i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(awaitSignal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Ikinci Firinci Firina Ekmek Atiyor...");
            ekmek.add(ekmekAtmaOrani);
            System.out.println("Firindaki Mevcut Ekmek Sayisi :" + ekmek.size());
        }
        
        lock.unlock();
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(awaitSignal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

    
    public boolean firinDolduMu()
    {
        if (ekmek.size() == 50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
