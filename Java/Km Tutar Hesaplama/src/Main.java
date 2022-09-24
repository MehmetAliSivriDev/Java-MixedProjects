
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        /*Kullanicidan aracinin ne kadar yaktigini ve ne kadar yol gittigi 
        bilgisini aliyoruz ve gerekli hesaplama islemlerini yaptiriyoruz*/
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Tutar Hesaplama Programi\n");
        System.out.print("Kac Tl Yakit Tuketiyor?= ");
  
        float yakit = scanner.nextFloat();
        
        System.out.print("Kac KM Yol Aldiniz?= ");
        
        float km = scanner.nextFloat();
        
        float sonuc = yakit * km ;
        
        System.out.println("Araciniz " + km + " Kilometrede " + sonuc + " yakit yakmistir");
        
    }
}
