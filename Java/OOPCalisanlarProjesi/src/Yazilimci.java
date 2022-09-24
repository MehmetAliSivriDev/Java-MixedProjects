
public class Yazilimci extends Calisan {
        
    private String yazilimDilleri;
    private int yazilimciMaasi;
    
    public Yazilimci (String ad,String soyad, int id, String kullaniciAdi, String parola ,String yazilimDilleri, int yazilimciMaasi)
    {
        super(ad, soyad, id, kullaniciAdi, parola);
        this.yazilimDilleri = yazilimDilleri;
        this.yazilimciMaasi = yazilimciMaasi;
    }
    
    public void bilgileriGoster ()
    {
        super.bilgileriGoster();
        System.out.println("Yazilimcinin Bildigi Diller= " + yazilimDilleri);
        System.out.println("Guncel Yazilimcinin Maasi= " +yazilimciMaasi);
    }
    
    public void FormatAt (String isletim_sistemi)
    {
        System.out.println(getAd() + " " + getSoyad() + "'in bilgisayarina " + isletim_sistemi + " yukleniyor...");
    }
    
    public void projeSunma (String konu)
    {
        System.out.println(konu + " hakkinda proje sunma isteginiz yoneticiye iletilmistir...");
    }
    
    public void zamTalebi (int zamMiktari)
    {
        System.out.println(zamMiktari + " tl zam talebiniz yoneticiye iletilmistir...");
    }
    
}
