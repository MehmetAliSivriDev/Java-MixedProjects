
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArabaBilgileri araba1 = new ArabaBilgileri();
        
        System.out.print("Arabanin Modelini Giriniz= ");
        araba1.setModel(scanner.nextLine());
        
        System.out.print("Arabanin Uretim Yilini Giriniz= ");
        araba1.setYil(scanner.nextInt());
        
        System.out.print("Arabanin Kapi Sayisini Giriniz= ");
        araba1.setKapi(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Arabanin Rengini Giriniz= ");
        araba1.setRenk(scanner.nextLine());
        
        System.out.print("Arabanin Uretim Bolgesini Giriniz(Ulke)= ");
        araba1.setUretimyeri(scanner.nextLine());
        
        System.out.println("\n\n"
                + "ARABA BILGILERI\n"
                + "***************\n"
                + "\nArabanin Modeli= " + araba1.getModel()
                + "\nArabanin Uretim Yili= " + araba1.getYil()
                + "\nArabanin Kapi Sayisi= " + araba1.getKapi()
                + "\nArabanin Rengi= " + araba1.getRenk()
                + "\nArabanin Uretim Bolgesi(Ulke)= " + araba1.getUretimyeri());
    }
    
}
