
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int ebob = 1;
        
        System.out.print("Birinci Sayiyi Giriniz= ");
        int a = scanner.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz= ");
        int b = scanner.nextInt();
        
        for(int i = 1;i<a;i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                ebob = i;
            }
        }
        
        System.out.println("Iki Sayinin Ebobu = " + ebob);

    }
    
}
