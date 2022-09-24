
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        int bakiye = 1000;
        int paraislemi;
               
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "ATM Islemleri\n"
                        + "--------------------------------------\n"
                        + "1- Bakiye Sorgulama\n"
                        + "2- Para Yatirma\n"
                        + "3- Para Cekme\n"
                        + "Q- Cikis Yapma\n\n";
        
        System.out.print(islemler); 
        
        while (true) 
        {
        
            System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q"))
            {
                System.out.println("Sistemden Cikis Yapiliyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                System.out.println("Mevcut Bakiyeniz= " + bakiye + "\n");
            }
            else if (islem.equals("2"))
            {
                System.out.print("Yatirmak Istediginiz Tutari Giriniz= ");
                    paraislemi = scanner.nextInt();
                    bakiye += paraislemi;
                    System.out.println("Yatirma Islemi Basari Ile Gerceklestirilmistir!"
                                     + "\nMevcut Bakiyeniz= "+ bakiye + "\n");
                    scanner.nextLine();
            }
            else if (islem.equals("3"))
            {
                System.out.print("Cekmek Istediginiz Tutari Giriniz= ");
                paraislemi = scanner.nextInt();
                scanner.nextLine();
                    
                    if(bakiye - paraislemi < 0)
                    {
                        System.out.println("Yetersiz Bakiye");
                    }
                    else
                    {
                    bakiye -= paraislemi;
                    System.out.print("Cekme Islemi Basari Ile Gerceklestirilmistir!"
                                   + "\nMevcut Bakiyeniz= "+ bakiye + "\n\n"); 
                    }
                    
            }
            else
            {
                System.out.println("Gecersiz Islem Girdiniz Lutfen Tekrar Giriniz!..");
            }
  
        }
        
    }
            
    
    
}
