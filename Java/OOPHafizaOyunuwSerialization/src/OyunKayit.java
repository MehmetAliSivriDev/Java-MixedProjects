
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OyunKayit {
    
    public static void kayitEt(Kart kartlar[][])
    {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))) {
            
            System.out.println("Oyun Kaydediliyor...");
            
            out.writeObject(kartlar);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadi.");
        } catch (IOException ex) {
            System.out.println("IOException Hatasi.");
        }
    }
    
    
    public static Kart[][] kayitYukle ()
    {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin")))
        {
            
            Kart[][] cikti = (Kart[][]) in.readObject();
            
            return cikti;
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadi.");
        } catch (IOException ex) {
            System.out.println("IOException Hatasi.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Obje Sinifi Bulunamadi.");
        }
        
        return null;         
        
    }
            
    
}
