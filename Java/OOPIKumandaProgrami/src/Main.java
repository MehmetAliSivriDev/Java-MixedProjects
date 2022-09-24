
import java.awt.BorderLayout;
import java.util.Scanner;


public class Main {
    
    public static void kanallariGoster (Kumanda kumanda)
    {
       if (kumanda.kanalSayisi() == 0)
       {
           System.out.println("Suanda Herhangi Bir Kanal Bulunamiyor.");
       }
       else
       {
           System.out.println("Kanallar Listesi :");
           
           for (String s : kumanda)
           {
               System.out.println("Kanal ->" + s);
           }
       }
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Kumanda kumanda = new Kumanda();
        
        String islemler = "1-Kanallari Goster\n"
                + "2-Kanal Ekle\n"
                + "3-Kanal Sil\n"
                + "4-Toplam Kanal Sayisini Goster\n"
                + "q- Uygulamadan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        System.out.println("Kumanda Programi");
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                kanallariGoster(kumanda);
            }
            else if (islem.equals("2"))
            {
                System.out.print("Eklemek Istediginiz Kanalin Adini Giriniz= ");
                String kanalAdi = scanner.nextLine();
                kumanda.kanalEkle(kanalAdi);
            }
            else if (islem.equals("3"))
            {
                System.out.print("Silmek Istediginiz Kanalin Adini Giriniz= ");
                String kanalAdi = scanner.nextLine();
                kumanda.kanalSil(kanalAdi);
            }
            else if (islem.equals("4"))
            {
                System.out.println("Toplam Mevcut Kanal Sayisi= " + kumanda.kanalSayisi());
            }
            else if (islem.equals("q"))
            {
                System.out.println("Programdan Cikis Yapiliyor...");
                break;
            }
            else
            {
                System.out.println("Hatali Secim Yaptiniz Lutfen Tekrar Deneyiniz!");
            }
                
        }
        
    }
    
    
    
}
