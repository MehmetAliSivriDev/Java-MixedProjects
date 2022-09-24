
import java.util.ArrayList;


public class Sarkicilar {
    
    private static ArrayList<String> sarkiciListesi = new ArrayList<String>();
    
    public static void sarkicilariBastir()
    {
        System.out.println("Listede " + sarkiciListesi.size() + " kadar sarkici bulunmaktadir...");
        
        for (int i=0;i<sarkiciListesi.size();i++)
        {
            System.out.println(i+1 +".Sarkici= " +sarkiciListesi.get(i));
        }
    }
    
    public static void sarkiciEkle(String isim)
    {
        sarkiciListesi.add(isim);
        System.out.println(isim + " adli sarkici listeye eklendi...");
        
    }
    
    public static void sarkiciSil(int pozisyon)
    {
        String isim = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);
        System.out.println(isim + " adli sarkici listeden silindi...");
    }
    
    public static void sarkiciGuncelle (int pozisyon, String isim)
    {
        sarkiciListesi.set(pozisyon - 1, isim);
        System.out.println("Sarkici listesi guncellendi...");
    }
    
    public static void sarkiciAra (String sarkiciIsmi)
    {
        int pozisyon = sarkiciListesi.indexOf(sarkiciIsmi);
        
        if (pozisyon >= 0)
        {
            System.out.println(sarkiciIsmi + " adli sarkici " + (pozisyon + 1) + ".sirada bulunmaktadir...");
        }
        else
        {
            System.out.println("Aradiginiz sarkici listede bulunmamaktadir...");
        }
    }
    
    
    
}
