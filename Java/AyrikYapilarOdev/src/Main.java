
public class Main {
    
    public static void main(String[] args) {
        
        Matematik mat = new Matematik();
        
        Matematik.Alan matAlan = new Matematik.Alan();
        
        Matematik.Alan.AlanHesaplama(4);
        
        matAlan.Konustur();
        
        mat.cevreYazdir(10);
        
    }
    
            
}

class Matematik{
    
    public static class Alan
    {        
        public static void AlanHesaplama(int yariCap)
        {            
            System.out.println("Yaricap Sonucu: " + yariCap*2);
                              
        }
        
        public void Konustur()
        {
            System.out.println("Merhaba!");
        }
    }
    
    public void cevreYazdir(int cevre)
    {
        System.out.println("Cevre : " + cevre);
    }
}

