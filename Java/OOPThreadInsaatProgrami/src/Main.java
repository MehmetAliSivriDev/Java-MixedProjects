
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        
        Calisanlar calisanlar = new Calisanlar();
        
        Thread cimentoIscisi = new Thread(new Runnable() {
            @Override
            public void run() {
                calisanlar.cimentoDokumu();
            }
        });
        
        Thread tuglaIscisi = new Thread(new Runnable() {
            @Override
            public void run() {
                calisanlar.tuglaDizimi();
            }
        });
        
        Thread demirIscisi = new Thread(new Runnable() {
            @Override
            public void run() {
                calisanlar.demirDizimi();
            }
        });
        
        cimentoIscisi.start();
        tuglaIscisi.start();
        demirIscisi.start();
                
        try {
            cimentoIscisi.join();
            tuglaIscisi.join();
            demirIscisi.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
        if (calisanlar.insaatBittiMi())
        {
            System.out.println("Insaat Basari Ile Tamamlandi.");
        }
        
    }
    
}
