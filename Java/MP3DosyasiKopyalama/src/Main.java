
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
        try
        {
            FileInputStream in = new FileInputStream("ses.mp3");
            
            int oku;
            
            while ((oku = in.read()) != -1)
            {
                icerik.add(oku);
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadi.");
        } catch (IOException ex) {
            System.out.println("IOException Hatasi.");
        }
    }
    
    public static void dosyaCikart(String yeniIsim)
    {
        try
        {
            FileOutputStream out = new FileOutputStream(yeniIsim);
            
            for (int deger : icerik)
            {
                out.write(deger);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadi."); 
        } catch (IOException ex) {
            System.out.println("IOException Hatasi.");
        }
    }
        
    public static void main(String[] args) {
        
        dosyaKopyala();
        
        long baslangic = System.currentTimeMillis();
        
        dosyaCikart("ses2.mp3");
        dosyaCikart("ses3.mp3");
        
        long bitis = System.currentTimeMillis();
        
        System.out.println("Dosya Basari Ile Kopyalandi Kopyalanma Sureci : " + ((bitis-baslangic) / 1000));
                
    }
            
    
}
