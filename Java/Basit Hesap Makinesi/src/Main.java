
import java.util.Scanner;


public class Main {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double sayi1,sayi2;
          
        System.out.println("Basit Hesap Makinesi Programi");
        
        System.out.println("Uygulamak Istediginiz Islemi Seciniz");
        System.out.println("1-Toplama");
        System.out.println("2-Cikarma");
        System.out.println("3-Carpma");
        System.out.println("4-Bolme");
        System.out.println("Islemi Giriniz= ");
        
        int islem = scanner.nextInt();
        
        switch (islem)
        {
            case 1 :
                
                System.out.println("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.println("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                System.out.println("Sonuc= " + (sayi1 + sayi2));        
                break;
            case 2 :
                System.out.println("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.println("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                System.out.println("Sonuc= " + (sayi1 - sayi2));        
                break;
            case 3 :
                System.out.println("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.println("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                System.out.println("Sonuc= " + (sayi1 * sayi2));        
                break;
            case 4 :
                System.out.println("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.println("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                System.out.println("Sonuc= " + (sayi1 / sayi2));        
                break;
            default :
                System.out.println("Hatali Islem Girdiniz!");
                break;
        }
                
              
        
        
    }
          
    
}
