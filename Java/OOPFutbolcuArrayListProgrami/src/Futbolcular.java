
import java.util.ArrayList;


public class Futbolcular {
    
    private static ArrayList<String> futbolcular = new ArrayList<String>();
    private static ArrayList<Integer> numaralar =  new ArrayList<Integer>();
    
    public static void futbolculariBastir()
    {
        
        if (futbolcular.size() == 0)
        {
            System.out.println("Takimda Herhangi Bir Oyuncu Bulunmamaktadir!");
        }
        else
        {
            System.out.println("Mevcut Kadromuzda Toplamda " + futbolcular.size() + " Adet Oyuncumuz Bulunmaktadir.\n"
                + "Bunlar :");
        
        
            for(int i=0;i<futbolcular.size();i++)
            {
                System.out.println((i+1) + ".Oyuncu :" + futbolcular.get(i) + " Forma Numarasi :" + numaralar.get(i));
            }
        }
        
    }
    
    public static void futbolcuEkle(String isim, int numara)
    {
        futbolcular.add(isim);
        numaralar.add(numara);
        System.out.println(isim + " Adli Oyuncu " + numara + " Numarali Formayla Takima Eklendi!");
    }
    
    public static void futbolcuSil(String isim)
    {
        int numara = futbolcular.indexOf(isim);
    
        futbolcular.remove(isim);
        numaralar.remove(numara);
        System.out.println(isim + " Adli Oyuncu Takimdan Cikarildi!");
    }
    
    public static void numaraGuncelle (int pozisyon, int numara)
    {
        String isim = futbolcular.get(pozisyon - 1);
        numaralar.set(pozisyon - 1, numara);
        System.out.println(isim + " Adli Oyuncunun Forma Numarasi " + numara + " Olarak Guncellendi!");
    }
    
    public static void futbolcuAra (String isim)
    {
        int yer = futbolcular.indexOf(isim);
        
        if (yer >= 0)
        {
            System.out.println("Futbolcu Takimda Yer Almaktadir Listedeki Mevcut"
                    + " Pozisyonu :" + (yer + 1 ));
        }
        else
        {
            System.out.println("Futbolcu Takimda Yer Almamaktadir!");
        }
    }
}
