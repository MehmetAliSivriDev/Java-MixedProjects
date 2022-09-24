
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        EvBilgileri ev1 = new EvBilgileri();
        
        System.out.println("**********************************\n"
                + "EMLAK KAYIT PROGRAMINA HOSGELDINIZ\n"
                + "**********************************");
        
        System.out.print("Evin Konumunu Giriniz= ");
        ev1.konum = scanner.nextLine();
        
        System.out.print("Evin Metrekaresini Giriniz= ");
        ev1.metrekare = scanner.nextInt();
        
        System.out.print("Evin Oda Sayisini Giriniz= ");
        ev1.oda = scanner.nextInt();
        
        System.out.print("Evin Salon Sayisini Giriniz= ");
        ev1.salon = scanner.nextInt();
        
        System.out.print("Evin Banyo Sayisini Giriniz= ");
        ev1.banyo = scanner.nextInt();
        
        System.out.print("Evin Tuvalet Sayisini Giriniz= ");
        ev1.tuvalet = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Evin Esya Durumunu Giriniz= ");
        ev1.esyadurumu = scanner.nextLine();
        
        System.out.println("Ev Bilgileri Kayıt Ediliyor...\n"
                + "******************************\n"
                + "EV BILGISI\n"
                + "******************************\n"
                + "Evin Konumu= " + ev1.konum 
                + "\nEvin Metrekaresi= " + ev1.metrekare
                + "\nEvin Oda Sayisi= " + ev1.oda
                + "\nEvin Salon Sayisi= " + ev1.salon
                + "\nEvin Banyo Sayisi= " + ev1.banyo
                + "\nEvin Tuvalet Sayisi= " + ev1.tuvalet
                + "\nEvin Esya Durumu= " + ev1.esyadurumu);
       
    }
    
}
