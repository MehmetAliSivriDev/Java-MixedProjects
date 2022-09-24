
import java.util.Scanner;


public class Main {

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1. Sayiyi Giriniz= ");
        
        float sayi1 = scanner.nextFloat();
        
        System.out.print("2. Sayiyi Giriniz= ");
        
        float sayi2 = scanner.nextFloat();
        
        System.out.print("3. Sayiyi Giriniz= ");
        
        float sayi3 = scanner.nextFloat();
        
        if (sayi1 > sayi2 && sayi1 > sayi3)
        {
            System.out.println(sayi1 + " En Buyuktur!");
        }
        else if (sayi2 > sayi1 && sayi2 > sayi3)
        {
            System.out.println(sayi2 + " En Buyuktur!");
        }
        else if (sayi3 > sayi1 && sayi3 > sayi2)
        {
            System.out.println(sayi3 + " En Buyuktur!");
        }
        
    
        
    }    
          
    
}
