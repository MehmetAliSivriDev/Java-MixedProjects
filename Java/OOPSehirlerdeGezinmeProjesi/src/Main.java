
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    private static Scanner scanner = new Scanner(System.in);

    
    public static void islemleriYazdir()
    {
        System.out.println("1-Islemleri Yeniden Yazdir");
        System.out.println("2-Mevcut Sehirleri Goruntule");
        System.out.println("3-Sehir Ekle");
        System.out.println("4-Sehiri Sirali Ekle");
        System.out.println("5-Sehir Sil");
        System.out.println("6-Sehir Gezme Sekmesine Gecis Yap");
        System.out.println("q-Uygulamadan Cikis Yap!");
    }
    
    public static void sehirGoruntule(LinkedList<String> linkedList)
    {
        ListIterator<String> iterator = linkedList.listIterator();
        
        int siralama = 0;
        
        if (iterator.hasNext() == false)
         {
             System.out.println("Listede Kayitli Bir Sehir Bulunmamaktadir...");
         }
        
        while (iterator.hasNext())
        {
            siralama += 1;
            System.out.println(siralama + ". Sehir= " + iterator.next());
        }
    
    }
    
    public static void ekle(LinkedList<String> linkedList, String isim)
    {
       linkedList.add(isim);
       System.out.println(isim + " Adli Sehir Listeye Eklendi...");
       
    }
    
    public static void siraliEkle(LinkedList<String> linkedList, String isim)
    {
        ListIterator<String> iterator = linkedList.listIterator();
        
        while (iterator.hasNext())
        {
            int cmp = iterator.next().compareToIgnoreCase(isim);
            
            if (cmp == 0)
            {
                System.out.println("Bu Sehir Listenizde Zaten Mevcut!");
                return;
            }
            else if (cmp < 0)
            {
                
            }
            else if (cmp > 0)
            {
                iterator.previous();
                linkedList.add(isim);
                System.out.println(isim + " Adli Sehir Listeye Eklendi...");
                return;
            }
        }
        System.out.println(isim + " Adli Sehir Listeye Eklendi...");
        linkedList.add(isim);
        
    }
    
    public static void sil(LinkedList<String> linkedList, String isim)
    { 
       linkedList.remove(isim);
       System.out.println(isim + " Adli Sehir Listeden Silindi...");
    }
 
    public static void sehirdeGez (LinkedList<String> linkedList)
    {
        ListIterator<String> iterator = linkedList.listIterator();
        
        System.out.println("1-Bir Sonraki Sehre Git");
        System.out.println("2-Bir Onceki Sehre Git");
        System.out.println("q-Sehir Gezme Sekmesinden Cikis Yap");
        
        boolean ileri = true;
        
        while(true)
        {
            System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
            String secim = scanner.nextLine();
            
            if (secim.equals("1"))
            {
                if (ileri == false)
                {
                    if (iterator.hasNext())
                    {
                        iterator.next();
                    }
                }
                ileri = true;
                
                if (iterator.hasNext())
                {
                    System.out.println(iterator.next() + " Adli Sehire Gidiliyor...");
                }
                else 
                {
                    System.out.println("Listede Kayitli Sehir Bulunamadi...Mevcut Sehirleri Gezdiniz...");
                    ileri = true;
                }    
            }
            else if (secim.equals("2"))
            {
                if (ileri == true)
                {
                    if (iterator.hasPrevious())
                    {
                        iterator.previous();
                    }      
                }
                ileri = false;
                
                if (iterator.hasPrevious())
                {
                    System.out.println(iterator.previous() + " Adli Sehire Gidiliyor...");
                }
                else 
                {
                   System.out.println("Listede Mevcut Olan Ilk Sehirdesiniz Iyi Eglenceler...");
                }
            }
            else if (secim.equals("q"))
            {
                System.out.println("Sehir Gezme Sekmesinden Cikis Yapiliyor...");
                islemleriYazdir();
                break;
            }
        }
            
       
        
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<String>();
         
        linkedList.add("Bursa");
        linkedList.add("Istanbul");
        linkedList.add("Edirne");
        
        boolean ileri = true;
        islemleriYazdir();
        
        while (true)
        {
            System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                islemleriYazdir();
            }
            else if (islem.equals("2"))
            {
                sehirGoruntule(linkedList);
            }
            else if (islem.equals("3"))
            {
                System.out.print("Eklemek Istediginiz Sehirin Adini Giriniz= ");
                String isim = scanner.nextLine();
                ekle(linkedList, isim);
            }
            else if (islem.equals("4"))
            {
                System.out.print("Eklemek Istediginiz Sehirin Adini Giriniz= ");
                String isim = scanner.nextLine();
                siraliEkle(linkedList, isim);
            }
            else if (islem.equals("5"))
            {
                System.out.print("Silmek Istediginiz Sehirin Adini Giriniz= ");
                String isim = scanner.nextLine();
                sil(linkedList, isim);
            }
            else if (islem.equals("6"))
            {
                sehirdeGez(linkedList);
            }
            else if (islem.equals("q"))
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
