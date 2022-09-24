
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Alinabilecek En Yuksek Puan= 520");
        
        Sayisal sayisal1 = new Sayisal("Mehmet", 30, 30, 30, 30);
        Sayisal sayisal2 = new Sayisal("Ahmet", 40, 40, 40, 40);
        Sayisal sayisal3 = new Sayisal("Veli", 20, 20, 20, 20);

        Sozel sozel1 = new Sozel("Murat",30, 30, 30, 30);
        Sozel sozel2 = new Sozel("Emre",10, 10, 10, 10);
        Sozel sozel3 = new Sozel("Murat",40, 40, 40, 40);
        
        System.out.println("******************************");
        System.out.println("Sayisalda Birinci :");
        System.out.println("******************************");
        Sayisal birinci = birinci(sayisal1,sayisal2,sayisal3);
        System.out.println("Birinci Olan Aday= " + birinci.getIsim() + " Puani= " + birinci.puanHesapla());
        
        System.out.println("******************************");
        System.out.println("Sozelde Birinci :");
        System.out.println("******************************");
        Sozel birinci2 = birinci(sozel1, sozel2, sozel3);
        System.out.println("Birinci Olan Aday= " + birinci2.getIsim() + " Puani= " + birinci2.puanHesapla());
    }
    
    public static <E extends Aday> E birinci(E e1,E e2,E e3)
    {
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla())
        {
            return e1;
        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla())
        {
            return e2;
        }
        else 
        {
            return e3;
        }
    }
    
}
