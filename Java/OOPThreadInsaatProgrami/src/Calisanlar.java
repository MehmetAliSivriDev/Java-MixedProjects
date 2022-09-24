
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Calisanlar {

    private final int calismaOrani = 1;
    
    BlockingQueue<Integer> insaat = new ArrayBlockingQueue<Integer>(100);   
    
    public void cimentoDokumu()
    {
        
        
        while(true)
        {
           
                   
            
            try {
                Thread.sleep(2000);
                
                if(insaat.size() == 100)
                {
                    System.out.println("Cimento Iscisi Isini Bitirdi.");
                    break;
                }
                else
                {
                    System.out.println("Cimento Iscisi Insaata Cimento Ekliyor...");
                                
                    insaat.put(calismaOrani);
                
                    System.out.println("Insaat Bitirme Yuzdesi %" + insaat.size()); 
                }
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Calisanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
 
    }
    
    public void tuglaDizimi()
    {
        
        
        while(true)
        {
            
            try {
                Thread.sleep(1000);
                
                if (insaat.size() == 100)
                {
                    System.out.println("Tugla Iscisi Isini Bitirdi.");
                    break;
                }
                else
                {
                    System.out.println("Tugla Iscisi Insaata Tugla Ekliyor...");
                                
                    insaat.put(calismaOrani);
                
                    System.out.println("Insaat Bitirme Yuzdesi %" + insaat.size());
                }
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Calisanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
 
    }
    
    public void demirDizimi()
    {
        
        
        while(true)
        {
            
            
            try {
                Thread.sleep(3000);
                
                if(insaat.size() == 100)
                {
                    System.out.println("Demir Iscisi Isini Bitirdi.");
                    break;
                }
                else
                {
                   System.out.println("Demir Iscisi Insaata Demir Diziyor...");
                                
                    insaat.put(calismaOrani);
                
                    System.out.println("Insaat Bitirme Yuzdesi %" + insaat.size()); 
                }
                
                
               
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Calisanlar.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
 
    }
    
    public boolean insaatBittiMi()
    {
        if (insaat.size() == 100)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
}
