
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        //Dik Ucgenin Hipotenusu = (Dik Kenar)^2 + (Yatay Kenar)^2 = (Hipotenus)^2
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Dik Ucgen Hipotenus Hesaplama Programi");
        System.out.print("Dik Kenari Giriniz= ");
        
        double dikkenar = scanner.nextFloat();
        
        System.out.print("Yatay Kenari Giriniz= ");

        double yataykenar = scanner.nextFloat();
        
        double hipotenus = Math.sqrt((yataykenar * yataykenar) + (dikkenar * dikkenar));
        
        System.out.println("Hipotenus= " + hipotenus);
        
    }
}
