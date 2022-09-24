
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cumleyi Giriniz= ");
        String cumle = scanner.nextLine();
        
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();
        
        for (int i=0;i<cumle.length();i++)
        {
            char a = cumle.charAt(i);
            
            if (frekans.containsKey(a))
            {
                frekans.replace(a, frekans.get(a) + 1);
            }
            else 
            {
                frekans.put(a, 1);
            }
        }
        
        
        System.out.println("Frekans Hesaplamasi Yapiliyor...");
        Thread.sleep(1000);
        
        for (Map.Entry<Character,Integer> entry : frekans.entrySet())
        {
            System.out.println(entry.getKey() + " Harfi Cumlede Toplam " + entry.getValue() + " Kez Geciyor.");
        }
    }
    
}
