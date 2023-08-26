
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        
        UreticiTuketici ut = new UreticiTuketici();
        
        Thread uretici = new Thread(new Runnable() {
            @Override
            public void run() {
                
                ut.uret();
                
            }
        });
        
        Thread tuketici = new Thread(new Runnable() {
            @Override
            public void run() {
                
                ut.tuket();
                
            }
        });
        
        uretici.start();
        tuketici.start();
        
        try {
            uretici.join();
            tuketici.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
            

    
}
