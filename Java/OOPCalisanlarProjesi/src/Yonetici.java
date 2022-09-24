
public class Yonetici extends Calisan {
    
    private int sorumlu_kisi_sayisi;
    
    public Yonetici (String ad, String soyad, int id, String kullaniciAdi, String parola, int sorumlu_kisi_sayisi)
    {
        super(ad, soyad, id, kullaniciAdi, parola);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
    
    public void bilgileriGoster ()
    {
        super.bilgileriGoster();
        System.out.println("Yoneticinin Sorumlu Oldugu Kisi Sayisi= " + sorumlu_kisi_sayisi);
    }
    
    public void zamYap (int zamMiktari)
    {
        System.out.println("Calisanlariniza " + zamMiktari + " tl zam yapiliyor...");
    }
    
    public void tatilIlani (String tarih)
    {
        System.out.println(tarih + " gunu tatil ilan edildi...");
    }
    
}
