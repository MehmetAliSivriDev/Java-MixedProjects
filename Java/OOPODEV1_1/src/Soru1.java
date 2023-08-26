
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class permutasyonException extends Exception
{
    //Kullaniciya hata verdirmek icin kendi olusturdugum exception classi
    
    public permutasyonException(String excpMesaji)
    {
        super(excpMesaji);
    }
}

abstract class permutasyonSorusu
{
    
    static void permutasyonHesaplama(ArrayList<Integer> SayiDizisi, int ikinciIndex)
    {
        for(int birinciIndex = ikinciIndex; birinciIndex < SayiDizisi.size(); birinciIndex++)
        {
            //swap fonksiyonu belirtilen listedeki belirtilen elemanlarin yerini degistirmek icin kullanilir.
            java.util.Collections.swap(SayiDizisi, birinciIndex, ikinciIndex);
            //Burada ikinci indexi 1 arttirarak ve fonksiyonu uygulayarak yine degistirme islemi gerceklestirmis oluyoruz ve ayrica 1 arttirdigimizdaki olusacak degisimleride yazdirmis oluyoruz.
            permutasyonHesaplama(SayiDizisi, ikinciIndex+1);
            java.util.Collections.swap(SayiDizisi, ikinciIndex, birinciIndex);
        }
        if (ikinciIndex == SayiDizisi.size() -1)
        {
            //Burada ikinci indeximiz sayi dizimizin son indeksine esit oldugunda dizimizdeki elemanlari yazdiriyor.
            //Buradaki Arrays.toString fonksiyonu diziye ait elemanları toplu bir şekilde string olarak geri döndüren fonksiyondur.
            System.out.println(java.util.Arrays.toString(SayiDizisi.toArray()));
        }   
    }
    
    //Sistemin kapatilmasina ya da yeniden baslatilmasina gerekli fonksiyonu abstract olarak tanimladim.
    abstract boolean devamMı(String secim);
}


public class Soru1 extends permutasyonSorusu{
    
    //Burada assagida kullanacagim ozelliklerimi belirttim.
    public static ArrayList<Integer> SayiDizisi = new ArrayList<Integer>();
    public static Scanner scanner = new Scanner(System.in);
    public static boolean devamMı = true;
    public static Soru1 menu = new Soru1();
    
    public static void main(String[] args) throws InterruptedException {
        
        
        while(devamMı)
        {
            //Kullanicidan sayi listemizin dizimizin boyutunu istiyoruz.
            System.out.print("Permutasyonunu Hesaplayacaginiz Dizinin Boyutunu Giriniz= ");
            int boyut = scanner.nextInt();

            int [] sayilar = new int [boyut];
            //Dizinin boyutu 1'den buyuk olmali ki siralama islemi gerceklestirilsin.
            if(boyut > 1)
            {
                //Kullanicidan dizinin elemanlarini aliyoruz.
                for(int i=0;i<boyut;i++)
                {
                    System.out.print((i+1) + ".Sayiyi Giriniz= ");
                    sayilar[i] = scanner.nextInt();
                }

                //Girilen Sayi dizisini yazdirma islemi.
                System.out.println("Girilen Sayi Dizisi :");
                for(int i=0;i<boyut;i++)
                {
                    System.out.print(sayilar[i] + " ");
                }

                System.out.println("\nDizinin Permutasyonlari Hesaplaniyor...");
                Thread.sleep(2000);
                
                //Dizinin elemanlarini Array List'e aktariyorum.
                for(int i=0;i<boyut;i++)
                {
                    SayiDizisi.add(sayilar[i]);
                }

                permutasyonSorusu.permutasyonHesaplama(SayiDizisi, 0);
                
                //Kullanicidan tekrardan islem yapmak istiyor mu diye soruyorum q ya basarsa programi kapatiyorum.
                System.out.print("Isleme Devam Etmek Istiyor Musunuz?(q-Cikis)= ");
                String secim = scanner.next();

                devamMı = menu.devamMı(secim);
            }
            else
            {
                
                try
                {
                    //Eger dizi 1 veya daha kucuk olursa kullaniciya verilecek olan hata mesaji.
                    String hataMesaji = "Dizinin Boyutu 1'den Buyuk Olmalidir!";
                    throw new permutasyonException(hataMesaji);
                
                }
                catch(permutasyonException me)
                {
                    me.printStackTrace();
                    System.out.println("Lutfen Tekrar Deneyiniz!");
                }

            }
        }
        
    }

    @Override
    boolean devamMı(String secim) {
        
        //Kullanicidan alinan cevaba gore sistemin kapatilip yada tekrardan baslamasini saglayan fonksiyon.
        
        if(secim.equals("q"))
        {
            System.out.println("Programdan Cikis Yapiliyor...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Soru1.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        else
        {
            System.out.println("Sistem Tekrardan Baslatiliyor...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Soru1.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }

    }

}
