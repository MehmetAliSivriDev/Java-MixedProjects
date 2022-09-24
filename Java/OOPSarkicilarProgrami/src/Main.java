
import java.util.Scanner;


public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static Sarkicilar sarkicilar = new Sarkicilar();
    
    public static void islemleriBastir()
    {
        System.out.println("1-Islemleri Yeniden Bastir");
        System.out.println("2-Sarkicilari Goruntule");
        System.out.println("3-Sarkici Ekle");
        System.out.println("4-Sarkici Sil");
        System.out.println("5-Sarkici Guncelle");
        System.out.println("6-Sarkici Ara");
        System.out.println("7-Uygulamadan Cik");

    }
    
    public static void ekle()
    {
        System.out.print("Eklemek Istediginiz Sarkicinin Adini Giriniz= ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }
    
    public static void sil()
    {
        System.out.print("Silmek Istediginiz Sarkicinin Pozisyonunu Giriniz(1,2,3)= ");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon - 1);
    }
    
    public static void guncelle()
    {
        System.out.print("Guncellemek Istediginiz Sarkicinin Poziyonunu Giriniz(1,2,3)= ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Yeni Sarkici Adini Giriniz= ");
        String isim = scanner.nextLine();
        
        sarkicilar.sarkiciGuncelle(pozisyon,isim);    
    }
    
    public static void ara()
    {
        System.out.print("Aramak Istediginiz Sarkicinin Ismini Giriniz= ");
        String sarkiciIsmi = scanner.nextLine();
        sarkicilar.sarkiciAra(sarkiciIsmi);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Sarkici Listesi Uygulamasina Hos Geldiniz!!");
        islemleriBastir();
        
        while (true)
        {
            System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
            int islem = scanner.nextInt();
            scanner.nextLine();
            
            if (islem == 1)
            {
                islemleriBastir();
            }
            else if (islem == 2)
            {
                sarkicilar.sarkicilariBastir();
            }
            else if (islem == 3)
            {
                ekle();
            }
            else if (islem == 4)
            {
                sil();
            }
            else if (islem == 5)
            {
                guncelle();
            }
            else if (islem == 6)
            {
                ara();
            }
            else if (islem == 7)
            {
                System.out.println("Uygulamadan Cikis Yapiliyor...");
                break;
            }
            else
            {
                System.out.println("Hatali Islem Sectiniz Lutfen Tekrar Seciniz...");
            }
          
        }
        
    }
    
    
}
