
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static String notHesaplama(String isim, int vize1, int vize2, int finaln)
    {
        int not = (vize1*3) /10 + (vize2*3) /10 + (finaln*4) / 10;        
        
        String cikti = "";
        
        if (not >= 90)
        {
          cikti = isim + " Adli Ogrencinin Harf Notu : AA";
        }
        else if (not >= 85)
        {
           cikti = isim + " Adli Ogrencinin Harf Notu : BA";
        }
        else if (not >= 80)
        {
            cikti = isim + " Adli Ogrencinin Harf Notu : BB";
        }
        else if (not >= 75)
        {
            cikti = isim + " Adli Ogrencinin Harf Notu : CB";
        }
        else if (not >= 70)
        {
            cikti = isim + " Adli Ogrencinin Harf Notu : CC";
        }else if (not >= 65)
        {
            cikti = isim + " Adli Ogrencinin Harf Notu : DC";
        }
        else if (not >= 60)
        {
            cikti = isim + " Adli Ogrencinin Harf Notu : DD";
        }
        else if (not >= 55)
        {
           cikti = isim + " Adli Ogrencinin Harf Notu : FD";
        }
        else
        {
            cikti = isim + " Adli Ogrencinin Harf Notu : FF";
        }
        
        return cikti;
        
    }
    
    
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(new FileReader("not.txt"));
            FileWriter writer = new FileWriter("HarfNolari.txt"))
            {
                
                while (scanner.hasNextLine())
                {
                    String bilgiler = scanner.nextLine();
                    String[] ogrenciArray = bilgiler.split(",");
                    
                    int vize1 =  Integer.valueOf(ogrenciArray[1]);
                    int vize2 = Integer.valueOf(ogrenciArray[2]);
                    int finaln = Integer.valueOf(ogrenciArray[3]);
                    String isim = ogrenciArray[0];
                    
                    String cikti = notHesaplama(isim, vize1, vize2, finaln);
                    
                    writer.write(cikti + "\n");
                }
                
            }  
            catch (FileNotFoundException ex) {
                System.out.println("Dosya Bulunamadi.");
            } 
            catch (IOException ex) {
                System.out.println("IOException Hatasi.");
            }
        
        
    }   
    
}
