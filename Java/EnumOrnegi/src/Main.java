    enum DerslerveKredileri{
        
        NesneyeYonelikProgramlama(3),
        BilgisayarBilimlerindeAyrikYapilar(2),
        BilgisayarBilimlerindeCebir(3),
        WebProgramlama(3),
        VeritabaniYonetimSistemleri(3);
        
        private int dersKredisi;
    
        DerslerveKredileri(int dersKredisi)
        {
            this.dersKredisi = dersKredisi;
        }
    
        public int getDersKredisi()
        {
            return dersKredisi;
        }
        
        
        
    }

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Ders Adlari :");
        
        for(DerslerveKredileri dersler : DerslerveKredileri.values())
        {
            System.out.println(dersler);
        }
        System.out.println();
        System.out.println("Ders Kredileri :");
        
        for(DerslerveKredileri krediler : DerslerveKredileri.values())
        {
            System.out.println(krediler + " Dersin Guncel Kredisi = " + krediler.getDersKredisi());
        }
    
    }
           
}
