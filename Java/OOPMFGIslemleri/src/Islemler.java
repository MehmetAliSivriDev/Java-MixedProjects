
public class Islemler {
    
    public static class Matematik 
    {
        public static void karekokBulma(double sayi)
        {
            System.out.println("Girdiginiz Sayinin Karekok Sonucu= " + Math.sqrt(sayi));
        }
        
        public static void usluHesaplama(int sayi1, int sayi2)
        {
            System.out.println(sayi1 + " Uzeri" + sayi2 + " nin Sonucu= " + Math.pow(sayi1, sayi2));
        }
        
        public static boolean asalKontrol (int sayi)
        {
            int i = 2;
            
            while (i < sayi)
            {
                if (sayi % i == 0)
                {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    
    public static class Fizik
    {
        public static void vectorCarpimi (Vec vec1, Vec vec2)
        {
            int carpimsonucu = (vec1.getI() * vec2.getI()) * (vec1.getJ() * vec2.getJ()) * (vec1.getK() * vec2.getK());
            
            System.out.println(vec1.getIsim() + " ve " + vec2.getIsim() + " Adli Vektorlerin Carpim Sonucu= " + carpimsonucu);
        }
                           
    }
    
    public static class Geometri 
    {
        public static void kareAlan (int kenar)
        {
            System.out.println("Karenin Alani= " + (kenar*kenar));
        }
        
        public static void kareCevre (int kenar)
        {
            System.out.println("Karenin Cevresi= " + (kenar * 4));
        }
        
        public static void ucgenAlan (int kenar1, int kenar2, int kenar3)
        {
            double u = (kenar1 + kenar2 + kenar3) / 2.0;
            double alan = Math.sqrt(u*(u - kenar1)*(u - kenar2)*(u - kenar3));
            
            System.out.println("Ucgenin Alani= " + alan);
        }
        
        public static void ucgenCevre (int kenar1, int kenar2, int kenar3)
        {
            System.out.println("Ucgenin Cevresi= " + (kenar1 + kenar2 + kenar3));
        }
        
        
    }
    
}
