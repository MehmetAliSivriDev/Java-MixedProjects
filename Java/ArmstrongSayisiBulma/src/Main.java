
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int sayi,basamaksayisi,gecicisayi;
        int toplam = 0;
        
        System.out.print("Lutfen Bir Sayi Giriniz= ");
        sayi = scanner.nextInt();
        System.out.print("Sayinizin Basamak Degerini Giriniz= ");
        basamaksayisi = scanner.nextInt();
        
        gecicisayi = sayi;
                
        do
        {
         int basamakdegeri = gecicisayi % 10;
         gecicisayi = gecicisayi / 10;
            
         toplam += Math.pow(basamakdegeri,basamaksayisi);
        }while(gecicisayi > 0);
        
        
        if (sayi == toplam)
        {
            System.out.println("Sayi Armstrong Sayisidir!");
        }
        else
        {
            System.out.println("Sayi Armstrong Sayisi Degildir!");
        }
    }
            
    
}
