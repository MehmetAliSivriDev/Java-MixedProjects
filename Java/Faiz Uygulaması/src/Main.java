
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        //Faiz Oranı = %6
        
        Scanner scanner = new Scanner(System.in);
        
        int anapara,vade;
        
        System.out.println("Bankamiza Hosgeldiniz \nFaiz Orani = %6"
                + "\n*******************************");
        
        System.out.print("Yatirmak Istediginiz Tutari Giriniz= ");
        anapara = scanner.nextInt();
        System.out.print("Kac Yil Vadeli Yatirmak Istiyorsunuz?= ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faiz = 0.06;
         
        
        for (int i = 1; i <= vade; i++)
        {
            toplampara = (toplampara * faiz) + toplampara;
            System.out.println(i + ". Yilinda Toplam Para Miktariniz= " + toplampara);
        }
              
        
    }
}
