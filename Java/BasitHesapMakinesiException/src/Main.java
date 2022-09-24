
import java.util.InputMismatchException;
import java.util.Scanner;

class carpmaException extends Exception
{

    @Override
    public void printStackTrace() {
        System.out.println("Iki Sayinizde 10000'i Asmamali!");
    }
    
}

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
        System.out.print("Islemi Giriniz= ");
        
        int islem = scanner.nextInt();
        
        try{
        switch (islem)
        {
            case 1 :
                
                System.out.print("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.print("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                System.out.println("Sonuc= " + (sayi1 + sayi2));        
                break;
            case 2 :
                System.out.print("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.print("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                System.out.println("Sonuc= " + (sayi1 - sayi2));        
                break;
            case 3 :
                System.out.print("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.print("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                if (sayi1 > 10000 && sayi2 > 10000)
                {
                    throw new carpmaException();
                }
                else
                {
                    System.out.println("Sonuc= " + (sayi1 * sayi2));        
                    break;
                }
            case 4 :
                System.out.print("Birinci Sayiyi Giriniz= ");
                sayi1 = scanner.nextDouble();
                System.out.print("Ikinci Sayiyi Giriniz= ");
                sayi2 = scanner.nextDouble();
                System.out.println("Sonuc= " + (sayi1 / sayi2));        
                break;
            default :
                System.out.println("Hatali Islem Girdiniz!");
                break;
        }
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Bir Sayi 0'a Bolunemez!");
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Lutfen Islemleri Dogru Formatta Giriniz(Integer)!");
        }
        catch(carpmaException ex)
        {
            ex.printStackTrace();
        }
        
        
            
              
        
        
    }
          
    
}
