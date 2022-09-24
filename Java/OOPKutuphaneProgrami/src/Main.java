
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> kitapIdleri = new ArrayList<Integer>();
        ArrayList<Integer> sayfaSayilari = new ArrayList<Integer>();
        ArrayList<String> kitapAdlari = new ArrayList<String>();
        ArrayList<String> yazarAdlari = new ArrayList<String>();
        ArrayList<String> yayinEvleri = new ArrayList<String>();
        
        AdminHesap hesap1 = new AdminHesap("admin", "1234");
        LoginIslemleri login = new LoginIslemleri();
                
        System.out.println("Admin Giris Paneli\n"
                + "******************");
        
        int girisHakki = 3;
        
        while (true)
        {
            if (login.login(hesap1) == true)
            {
                System.out.println("Giris Onaylandi Hos Geldiniz!");
                break;
            
            }
            else 
            {
                System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz!");
                System.out.println("Kalan Giris Hakkiniz= " + girisHakki);
                girisHakki -= 1;
                
                if (girisHakki < 0)
                {
                    System.out.println("Tum Giris Hakkinizi Tukettiniz Sistemden Cikartiliyorsunuz...");
                    System.exit(0);
                }
            }
        }
        
        String islemler = "1-Kutuphaneye Yeni Bir Kitap Kayidi Yap\n"
                + "2-Kutuphanede Olan Mevcut Kitaplari Goruntule\n"
                + "q-Uygulamadan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                System.out.print("Kitabin Id Numarasini Giriniz= ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Kitabin Adini Giriniz= ");
                String kitapAdi = scanner.nextLine();
                
                System.out.print("Kitabin Yazar Adini Giriniz= ");
                String yazar = scanner.nextLine();
                
                System.out.print("Kitabin Yayin Evini Giriniz= ");
                String yayinEvi = scanner.nextLine();
                
                System.out.print("Kitabin Sayfa Sayisini Giriniz= ");
                int sayfaSayisi = scanner.nextInt();
                scanner.nextLine();
                
                //ArrayListlerden dolayi kitap objesi olusturulmasa da program calisir!
                //Buradaki amac kullanicidan alinan verilerle obje olusturma!
                Kitap kitap = new Kitap(id, kitapAdi, yazar, yayinEvi, sayfaSayisi);
                //******************************************************************
                
                kitapIdleri.add(id);
                kitapAdlari.add(kitapAdi);
                yazarAdlari.add(yazar);
                yayinEvleri.add(yayinEvi);
                sayfaSayilari.add(sayfaSayisi);
                
                System.out.println("Kitap Basari Ile Kaydedildi...");
            }
            else if (islem.equals("2"))
            {
                if (kitapIdleri.size() == 0)
                {
                    System.out.println("Kutuphanede Kayitli Herhangi Bir Kitap Bulunamadi...");
                }
                else
                {
                
                    System.out.println("*************************************************");
                    System.out.println("Id - KitapAdi - YazarAdi - YayinEvi - SayfaSayisi");
                    System.out.println("*************************************************");
                
                    for (int i = 0;i < kitapIdleri.size();i++)
                    {
                        System.out.println(kitapIdleri.get(i) + " - " + kitapAdlari.get(i) + " - " + yazarAdlari.get(i) + " - " + yayinEvleri.get(i) + " - " + sayfaSayilari.get(i));
                    }
                
                    System.out.println("*************************************************");
                }
            }
            else if (islem.equals("q"))
            {
                System.out.println("Sistemden Cikartiliyorsunuz...");
                break;
            }
        }
        
    }
    
}
