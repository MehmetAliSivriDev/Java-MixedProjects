
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    
    public static void dosyaKopyala()
    {
        try {
            FileInputStream in = new FileInputStream("ses.mp3");
            
            int oku;
            
            while ((oku = in.read()) != -1)
            {
                icerik.add(oku);
            }
                
                
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
    public static void dosyaCikart(String yeniAd)
    {
        try {
            FileOutputStream out = new FileOutputStream(yeniAd);
            
            for (int deger : icerik)
            {
                out.write(deger);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
           
    
    
    
    public static void main(String[] args) {
        
        long baslangic = System.currentTimeMillis();
        
        dosyaKopyala();
        
        Thread dosyaKopyalama1 = new Thread(new Runnable() {
            @Override
            public void run() {
                dosyaCikart("ses2.mp3");
            }
        });
        
        Thread dosyaKopyalama2 = new Thread(new Runnable() {
            @Override
            public void run() {
                dosyaCikart("ses3.mp3");
            }
        });
        
        dosyaKopyalama1.start();
        dosyaKopyalama2.start();
        
        try {
            dosyaKopyalama1.join();
            dosyaKopyalama2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long bitis = System.currentTimeMillis();
        
        System.out.println("Kopyalama Islemi Tamamlanmistir Gecen Sure : " + (bitis-baslangic) / 1000 + " Saniye");
                
        
    }

            

    
}
