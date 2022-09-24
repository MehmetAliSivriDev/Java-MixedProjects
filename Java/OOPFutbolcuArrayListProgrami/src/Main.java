
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Futbolcular futbolcular = new Futbolcular();
        
        String islemler = "1-Kadroyu Goster\n"
                + "2-Futbolcuyu Kadroya Ekle\n"
                + "3-Futbolcuyu Kadrodan Cikar\n"
                + "4-Futbolcunun Forma Numarasini Guncelle\n"
                + "5-Kadroda Futbolcu Ara\n"
                + "q-Uygulamadan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
                
        System.out.println("Futbolcu ArrayList Programina HosGeldiniz!");
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                futbolcular.futbolculariBastir();
            }
            else if (islem.equals("2"))
            {
                System.out.print("Futbolcunun Adini Giriniz= ");
                String isim = scanner.nextLine();
                
                System.out.print("Futbolcunun Forma Numarasini Giriniz= ");
                int numara = scanner.nextInt();
                scanner.nextLine();
                
                futbolcular.futbolcuEkle(isim, numara);
            }
            else if (islem.equals("3"))
            {
                System.out.print("Kadrodan Cikarmak Istediginiz Futbolcunun Ismini Giriniz= ");
                String isim = scanner.nextLine();
                
                futbolcular.futbolcuSil(isim);
            }
            else if (islem.equals("4"))
            {
                System.out.print("Oyuncunun Listedeki Pozisyonunu Giriniz= ");
                int pozisyon = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Oyuncunun Yeni Forma Numarasini Giriniz= ");
                int numara = scanner.nextInt();
                scanner.nextLine();
                
                futbolcular.numaraGuncelle(pozisyon, numara);
            }
            else if (islem.equals("5"))
            {
                System.out.print("Aramak Istediginiz Futbolcununu Adini Giriniz= ");
                String isim = scanner.nextLine();
                
                futbolcular.futbolcuAra(isim);
            }
            else if (islem.equals("q"))
            {
                System.out.println("Uygulamadan Cikis Yapiliyor...");
                break;
            }
            else
            {
                System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz!");
            }
        }
        
        
    }
            
    
}
