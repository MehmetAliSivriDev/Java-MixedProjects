
import java.util.Scanner;


public class Main {
    
    public static void main (String[] args)
    {
      //Beden Kitle Indeksi = kilo(Kg) / boy(m) * boy(m)
        
        Scanner scanner = new Scanner(System.in);
        
                
        System.out.println("Beden Kitle Indeksi Hesaplama Programi\n");
        
        System.out.print("Kilonuzu Giriniz= ");
        double kilo = scanner.nextDouble();

        System.out.print("Boyunuzu Giriniz= ");
        double boy  = scanner.nextDouble();

        double indeks = kilo / (boy*boy);
        
        System.out.println("Beden Kitle Indeksiniz= " + indeks);
        
        
    }
}
