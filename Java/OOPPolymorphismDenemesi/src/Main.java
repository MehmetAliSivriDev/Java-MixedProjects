
import java.util.Scanner;


public class Main {

    public static void konustur (Insan insan)
    {
        insan.konustur();
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String islemler = "1-Ahmet'i Konustur\n"
                + "2-Fatma'yi Konustur\n"
                + "q-Uygulamadan Cikis Yap\n"
                + "Konusturmak Istediginiz Insani Seciniz= ";
        
        boolean cikis = false;
        
        while (cikis == false)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                konustur(new Ahmet("Bisiklet Surmek", "Rap", "Ahmet Turk", "Ogretmen", "Rize", 30));
            }
            else if (islem.equals("2"))
            {
                konustur(new Fatma("Kitap Okumak", "Arabesk", "Fatma Demir", "Doktor", "Adana", 27));
            }
            else if (islem.equals("q"))
            {
                System.out.println("Uygulamadan Cikis Yapiliyor...");
                cikis = true;
            }
            else 
            {
                System.out.println("Hatali Giris Yaptiniz!");
            }
        }
    }
            
    
}
