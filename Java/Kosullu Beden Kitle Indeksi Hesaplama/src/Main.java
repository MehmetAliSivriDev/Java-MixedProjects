
import java.util.Scanner;


public class Main {
    
    /* Beden Kitle Indeksi = kilo / boy(m) * boy(m)    
        BKI 18,5'in altindaysa -> zayif
        BKI 18,5 ile 25'in arasindaysa -> Normal
        BKI 25 ile 30 arasindaysa -> Fazla Kilolu
        BKI 30'un uzerindeyse -> Obez
    */
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Kilonuzu Giriniz (kg)= ");
        
        double kilo = scanner.nextDouble();
        
        System.out.print("Lutfen Boyunuzu Giriniz (m)= ");
        
        double boy = scanner.nextDouble();
        
        double indeks = kilo / (boy*boy);
        

        
        if (indeks < 18.5)
        {
        System.out.println("Beden Kitle Indeksiniz= " + indeks + " Durumunuz= Zayif");       
        }
        else if (18.5 <= indeks && indeks < 25)
        {
        System.out.println("Beden Kitle Indeksiniz= " + indeks + " Durumunuz= Normal");       
        }
        else if (25 <= indeks && indeks <30)
        {
        System.out.println("Beden Kitle Indeksiniz= " + indeks + " Durumunuz= Fazla Kilolu");       
        }
        else if (indeks > 30)
        {
        System.out.println("Beden Kitle Indeksiniz= " + indeks + " Durumunuz= Obez");       
        }
    }
       

}   
