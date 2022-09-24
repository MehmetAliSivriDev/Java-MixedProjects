
import java.util.Scanner;


public class Main {

    public static void toplama (int sayi1, int sayi2)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1.Sayiyi Giriniz= ");
        sayi1 = scanner.nextInt();
        
        System.out.print("2.Sayiyi Giriniz= ");
        sayi2 = scanner.nextInt();
        
        System.out.println("Toplama Isleminin Sonucu= " + (sayi1+sayi2));
    }
    
    public static void cikarma (int sayi1, int sayi2)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1.Sayiyi Giriniz= ");
        sayi1 = scanner.nextInt();
        
        System.out.print("2.Sayiyi Giriniz= ");
        sayi2 = scanner.nextInt();
        
        System.out.println("Cikarma Isleminin Sonucu= " + (sayi1-sayi2));
    }
    
    public static void carpma (int sayi1, int sayi2)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1.Sayiyi Giriniz= ");
        sayi1 = scanner.nextInt();
        
        System.out.print("2.Sayiyi Giriniz= ");
        sayi2 = scanner.nextInt();
        
        System.out.println("Carpma Isleminin Sonucu= " + (sayi1*sayi2));
    }
    
    public static void bolme (int sayi1, int sayi2)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1.Sayiyi Giriniz= ");
        sayi1 = scanner.nextInt();
        
        System.out.print("2.Sayiyi Giriniz= ");
        sayi2 = scanner.nextInt();
        
        System.out.println("Bolme Isleminin Sonucu= " + (sayi1/sayi2));
    }
    
    public static void karekok (double kok)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Karekokunu Almak Istediginiz Sayiyi Giriniz= ");
        kok = scanner.nextDouble();
        
        System.out.println("Karekok Isleminin Sonucu= " + Math.sqrt(kok));
    }
    
    public static void uslusayi (int sayi1, int sayi2)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Uslu Sayinin Taban Degerini Giriniz= ");
        sayi1 = scanner.nextInt();
        
        System.out.print("Uslu Sayinin Ust Degerini Giriniz= ");
        sayi2 = scanner.nextInt();
        
        System.out.println("Sonuc= " + Math.pow(sayi1,sayi2));
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1-Toplama\n"
                + "2-Cikarma\n"
                + "3-Carpma\n"
                + "4-Bolme\n"
                + "5-Karekokunu Alma\n"
                + "6-Uslu Sayi Hesaplama\n"
                + "7-Sistemden Cikis Yapmak\n\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
       
    while(true)
    {
        
        
        System.out.println("*******************\n"
                + "MATEMATIK ISLEMLERI\n"
                + "*******************");
        System.out.print(islemler);
        int islem = scanner.nextInt();
        
        switch(islem)
        {
            case 1 :
                toplama(0,0);
                break;
            case 2 :
                cikarma(0,0);
                break;
            case 3 :
                carpma(0,0);
                break;
            case 4 :
                bolme(0,0);
                break;
            case 5 : 
                karekok(0);
                break;
            case 6 :
                uslusayi(0,0);
                break;
            case 7 :
                System.out.print("Sistemden Cikis Yapmayi Onayliyor Musunuz?\n"
                        + "1-Evet\n"
                        + "2-Hayir\n\n"
                        + "Uygulamak Istediginiz Islem= ");
                islem = scanner.nextInt();
                
                if(islem == 1)
                {
                    System.exit(0);
                }
                else
                {
                    
                }
        
        }
        
        
    }    
              
        
        
        
        
    }
    
}
