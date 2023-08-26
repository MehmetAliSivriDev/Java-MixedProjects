class Araba
{    
    //Static Fonksyion Ornegi
    public static void arabaCalistirma()
    {
        System.out.println("Araba Calistiriliyor...(Araba Classina Ait Statik Metod Ornegi)");
    }
    
    public void silicekleriCalistirma()
    {
        System.out.println("Arabanin Silicekler Calistiriliyor...(Araba Classina Ait Statik Olmayan Metod Ornegi)");
    }
    
}

class Volvo extends Araba
{
    public static String arabaAdi = "Volvo";
    
    //Static Fonksyion Ornegi
    public static void arabaCalistirma()
    {
        System.out.println("Volvo Calistiriliyor...(Volvo Classina Ait Statik Metod Ornegi)");
    }
    
    @Override
    public void silicekleriCalistirma() {
        System.out.println("Volvo'nun Silicekleri Calisiyor...(Volvo Classina Ait Statik Olmayan Metod Ornegi)");
    }
    
}

public class StaticBindingOrnegi {
    
    public static void main(String[] args) {
        
        Volvo volvoArabasi = new Volvo();
        Araba normalAraba = new Araba();
        
        //Static Fonksiyona Direkt Olarak Sinifin Adiyla Erisebiliyoruz.
        //Static Fonksiyon Cagirma Ornegi
        Araba.arabaCalistirma();
        //**************************************************************
        normalAraba.silicekleriCalistirma();
        //**************************************************************
        
        /*Static Fonksiyona Direkt Olarak Sinifin Adiyla Erisebiliyoruz.
        Ayrica Sadece Fonksiyon Degil O Classa Ait Ozelliklerede Sinifin Adiyla
        EriseBiliyoruz.
        */
        //Static Fonksiyon Cagirma Ornegi
        Volvo.arabaCalistirma();
        //Volvo Classina Ait Static Ozellige Erisme Ornegi
        System.out.println("Aracin Adi= " + Volvo.arabaAdi);
        //**************************************************************
        
        volvoArabasi.silicekleriCalistirma();
        //**************************************************************
    }
    
}
