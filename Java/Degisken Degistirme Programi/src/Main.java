
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Sayiyi Giriniz= ");
        
        int birincisayi = scanner.nextInt();
        
        System.out.print("Ikinci Sayiyi Giriniz= ");
        
        int ikincisayi = scanner.nextInt();
       
        System.out.println("Degistirilmeden Onceki Degerler \n -Birinci Sayi="
                + birincisayi + "\n -Ikinci Sayi=" + ikincisayi);
        
        System.out.println("Degistirilme Islemi Gerceklestiriliyor...");
        
        int gecici = birincisayi;
        birincisayi = ikincisayi;
        ikincisayi = gecici;
        
        
        System.out.println("Degistirilme Sonrasi Degerler \n -Birinci Sayi="
                + birincisayi + "\n -Ikinci Sayi= " + ikincisayi);
                
        
    }
}
