
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class waitNotify {
   
    ArrayList<Integer> sektirme = new ArrayList<Integer>();
    
    private final int sektirmeOrani = 1;
    Object lock = new Object();
    public void birinciOyuncu()
    {
  
        while(true)
        {
          
            synchronized (lock) 
            {
                if (sektirme.size() == 25 || sektirme.size() == 75 || sektirme.size() == 100)
                {
                    try {
                        
                        if (sektirme.size() == 100)
                        {
                            return;
                        }
                        
                        lock.wait();
        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(waitNotify.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                   for (int i=0;i<25;i++)
                   {
                       try {
                           Thread.sleep(500);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(waitNotify.class.getName()).log(Level.SEVERE, null, ex);
                       }
                        System.out.println("Birinci Oyuncu Top Sektiriyor...");
                        sektirme.add(sektirmeOrani);
                        System.out.println("Toplam Sektirme = " + sektirme.size());
                        
                    }
                    lock.notify(); 
                                 
                }
        }   }
        
    }
    
    public void ikinciOyuncu()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(waitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(true)
        {
          
            synchronized (lock) 
            {
                if (sektirme.size() == 50 || sektirme.size() == 100)
                {
                    try {
                    
                        if (sektirme.size() == 100)
                        {
                            return;
                        }
                        
                        lock.wait();
                        
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(waitNotify.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                   for (int i=0;i<25;i++)
                   {
                       try {
                           Thread.sleep(500);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(waitNotify.class.getName()).log(Level.SEVERE, null, ex);
                       }
                        System.out.println("Ikinci Oyuncu Top Sektiriyor...");
                        sektirme.add(sektirmeOrani);
                        System.out.println("Toplam Sektirme = " + sektirme.size()); 
                    }
                    lock.notify();
                }
        }   }
    }
    
    public boolean sektirmeBittiMi()
    {
        if (sektirme.size() == 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
