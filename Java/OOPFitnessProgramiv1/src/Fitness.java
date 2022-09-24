
public class Fitness {
    
    private String isim;
    private double kutle_beden_indeksi;
    private int sinav;
    private int mekik;
    private int onkol;
    private int arkakol;
    private int sirt;
    private int gogus;
    private int bacak;
    
    
    public Fitness(String isim, int sinav, int mekik, int onkol, int arkakol, int sirt, int gogus, int bacak) {
        this.isim = isim;
        this.sinav = sinav;
        this.mekik = mekik;
        this.onkol = onkol;
        this.arkakol = arkakol;
        this.sirt = sirt;
        this.gogus = gogus;
        this.bacak = bacak;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getKutle_beden_indeksi() {
        return kutle_beden_indeksi;
    }

    public void setKutle_beden_indeksi(double kutle_beden_indeksi) {
        this.kutle_beden_indeksi = kutle_beden_indeksi;
    }

    public int getSinav() {
        return sinav;
    }

    public void setSinav(int sinav) {
        this.sinav = sinav;
    }

    public int getMekik() {
        return mekik;
    }

    public void setMekik(int mekik) {
        this.mekik = mekik;
    }

    public int getOnkol() {
        return onkol;
    }

    public void setOnkol(int onkol) {
        this.onkol = onkol;
    }

    public int getArkakol() {
        return arkakol;
    }

    public void setArkakol(int arkakol) {
        this.arkakol = arkakol;
    }

    public int getSirt() {
        return sirt;
    }

    public void setSirt(int sirt) {
        this.sirt = sirt;
    }

    public int getGogus() {
        return gogus;
    }

    public void setGogus(int gogus) {
        this.gogus = gogus;
    }

    public int getBacak() {
        return bacak;
    }

    public void setBacak(int bacak) {
        this.bacak = bacak;
    }
    
    public void hareketYap (String tur,int sayi)
    {
        if (tur.equals("sinav"))
        {
            sinavYap(sayi);
        }
        else if (tur.equals("mekik"))
        {
            mekikYap(sayi);
        }
        else if (tur.equals("onkol"))
        {
            onkolYap(sayi);
        }
        else if (tur.equals("arkakol"))
        {
            arkakolYap(sayi);
        }
        else if (tur.equals("sirt"))
        {
            sirtYap(sayi);
        }
        else if (tur.equals("gogus"))
        {
            gogusYap(sayi);
        }
        else if (tur.equals("bacak"))
        {
            bacakYap(sayi);
        }
        else
        {
            System.out.println("Yanlis Giris Yaptiniz Lutfen Tekrar Giriniz!");
        }
    }
    
    public void sinavYap (int sayi)
    {
        if (sinav == 0)
        {
            System.out.println("Tebrikler Sinav Idmanini Tamamladiniz!\nKalan Hareket Sayisi= " + sinav);
        }
        else if (sinav - sayi < 0)
        {
            sinav = 0;
            System.out.println("Bugun Formundasin Bakiyorum Gerekenden Fazlasini Yaptin Basmaya DEVAMM!!\nKalan Hareket Sayisi= " + sinav);
        }
        else
        {
            sinav -=sayi;
            System.out.println("Kalan Hareket Sayisi= " + sinav);
        }
    }
    
    public void mekikYap (int sayi)
    {
        if (mekik == 0)
        {
            System.out.println("Tebrikler Mekik Idmanini Tamamladiniz!\nKalan Hareket Sayisi= " + mekik);
        }
        else if (mekik - sayi < 0)
        {
            mekik = 0;
            System.out.println("Bugun Formundasin Bakiyorum Gerekenden Fazlasini Yaptin Basmaya DEVAMM!!\nKalan Hareket Sayisi= " + mekik);
        }
        else
        {
            mekik -=sayi;
            System.out.println("Kalan Hareket Sayisi= " + mekik);
        }
    }
    
    public void onkolYap (int sayi)
    {
        if (onkol == 0)
        {
            System.out.println("Tebrikler On Kol Idmanini Tamamladiniz!\nKalan Hareket Sayisi= " + onkol);
        }
        else if (onkol - sayi < 0)
        {
            onkol = 0;
            System.out.println("Bugun Formundasin Bakiyorum Gerekenden Fazlasini Yaptin Basmaya DEVAMM!!\nKalan Hareket Sayisi= " + onkol);
        }
        else
        {
            onkol -=sayi;
            System.out.println("Kalan Hareket Sayisi= " + onkol);
        }
    }
    
    public void arkakolYap (int sayi)
    {
        if (arkakol == 0)
        {
            System.out.println("Tebrikler Arka Kol Idmanini Tamamladiniz!\nKalan Hareket Sayisi= " + arkakol);
        }
        else if (arkakol - sayi < 0)
        {
            arkakol = 0;
            System.out.println("Bugun Formundasin Bakiyorum Gerekenden Fazlasini Yaptin Basmaya DEVAMM!!\nKalan Hareket Sayisi= " + arkakol);
        }
        else
        {
            arkakol -=sayi;
            System.out.println("Kalan Hareket Sayisi= " + arkakol);
        }
    }
    
    public void sirtYap (int sayi)
    {
        if (sirt == 0)
        {
            System.out.println("Tebrikler Sirt Idmanini Tamamladiniz!\nKalan Hareket Sayisi= " + sirt);
        }
        else if (sirt - sayi < 0)
        {
            sirt = 0;
            System.out.println("Bugun Formundasin Bakiyorum Gerekenden Fazlasini Yaptin Basmaya DEVAMM!!\nKalan Hareket Sayisi= " + sirt);
        }
        else
        {
            sirt -=sayi;
            System.out.println("Kalan Hareket Sayisi= " + sirt);
        }
    }
    
    public void gogusYap (int sayi)
    {
        if (gogus == 0)
        {
            System.out.println("Tebrikler Gogus Idmanini Tamamladiniz!\nKalan Hareket Sayisi= " + gogus);
        }
        else if (gogus - sayi < 0)
        {
            gogus = 0;
            System.out.println("Bugun Formundasin Bakiyorum Gerekenden Fazlasini Yaptin Basmaya DEVAMM!!\nKalan Hareket Sayisi= " + gogus);
        }
        else
        {
            gogus -=sayi;
            System.out.println("Kalan Hareket Sayisi= " + gogus);
        }
    }
    
    public void bacakYap (int sayi)
    {
        if (bacak == 0)
        {
            System.out.println("Tebrikler Bacak Idmanini Tamamladiniz!\nKalan Hareket Sayisi= " + bacak);
        }
        else if (bacak - sayi < 0)
        {
            bacak = 0;
            System.out.println("Bugun Formundasin Bakiyorum Gerekenden Fazlasini Yaptin Basmaya DEVAMM!!\nKalan Hareket Sayisi= " + bacak);
        }
        else
        {
            bacak -=sayi;
            System.out.println("Kalan Hareket Sayisi= " + bacak);
        }
    }
    
    public void kbiHesaplama (double kilo,double boy)
    {
        kutle_beden_indeksi = kilo / (boy * boy);
                
        if (kutle_beden_indeksi > 30)
        {
            System.out.println("Kutle Beden Indeksinize Gore Durumunuz= Obez\nMevcut Kutle Beden Indeksiniz= " + kutle_beden_indeksi);
        }
        else if (kutle_beden_indeksi > 25 && kutle_beden_indeksi < 30)
        {
            System.out.println("Kutle Beden Indeksinize Gore Durumunuz= Asiri Kilolu\nMevcut Kutle Beden Indeksiniz= " + kutle_beden_indeksi);
        }
        else if (kutle_beden_indeksi > 18.50 && kutle_beden_indeksi < 25)
        {
            System.out.println("Kutle Beden Indeksinize Gore Durumunuz= Saglikli Kilo\nMevcut Kutle Beden Indeksiniz= " + kutle_beden_indeksi);
        }
        else
        {
            System.out.println("Kutle Beden Indeksinize Gore Durumunuz= Zayif\nMevcut Kutle Beden Indeksiniz= " + kutle_beden_indeksi);
        }
    }
    
    public boolean programbittimi ()
    {
        return (sinav == 0) && (mekik == 0) && (onkol == 0) && (arkakol == 0) && (sirt == 0) && (gogus == 0) && (bacak == 0);
    }
}
