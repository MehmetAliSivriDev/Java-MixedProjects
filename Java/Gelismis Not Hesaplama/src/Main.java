
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        /* 
         Final >= 50 yukari olmali
        
        
          Kisa Sinav 1 -> %10
          kisa Sinav 2 -> %10
          Vize -> %20
          Odev -> %10
          Final -> %50
           
            90>= -> AA
            85>= -> BA
            80>= -> BB
            75>= -> CB
            70>= -> CC
            65>= -> DC
            60>= -> DD
            55>= -> FD
            55<  -> FF
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kisa Sinav 1 Notunuzu Giriniz= ");        
        double kisa1 = scanner.nextDouble();
        
        System.out.println("Kisa Sinav 2 Notunuzu Giriniz= ");        
        double kisa2 = scanner.nextDouble();
        
        System.out.println("Vize Notunuzu Giriniz= ");
        double vize = scanner.nextDouble();
        
        System.out.println("Odev Notunuzu Giriniz= ");
        double odev = scanner.nextDouble();
        
        System.out.println("Final Notunuzu Giriniz= ");
        double finaln = scanner.nextDouble();
        
        double sonuc = (kisa1*10)/100 + (kisa2*10)/100 + (vize*20)/100
                + (odev*10)/100 + (finaln*50)/100;
        
        if (sonuc >= 90 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi AA");
            System.out.println("Tebrikler Dersi Gectiniz!");
        }
        else if (sonuc >= 85 && sonuc < 90 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi BA");
            System.out.println("Tebrikler Dersi Gectiniz!");
        }
        else if (sonuc >= 80 && sonuc < 85 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi BB");
            System.out.println("Tebrikler Dersi Gectiniz!");
        }
        else if (sonuc >= 75 && sonuc < 80 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi CB");
            System.out.println("Tebrikler Dersi Gectiniz!");
        }
        else if (sonuc >= 70 && sonuc < 75 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi CC");
            System.out.println("Tebrikler Dersi Gectiniz!");
        }
        else if (sonuc >= 65 && sonuc < 70 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi DC");
            System.out.println("Dersi Kosullu Gectiniz!");
        }
        else if (sonuc >= 60 && sonuc < 65 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi DD");
            System.out.println("Dersi Kosullu Gectiniz!");
        }
        else if (sonuc >= 55 && sonuc < 60 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi FD");
            System.out.println("Dersi Kosullu Gectiniz!");
        }
        else if (sonuc < 55 && finaln >= 50)
        {
            System.out.println("Ortalamaniz= "+ sonuc + " Harf Degerlendirmesi FF");
            System.out.println("MAALESEF DERSTEN KALDINIZ BIRDAHAKI SEFER DAHA COK"
                    + " CALISMALISINIZ!");                     
        }
        else if (finaln < 50)
        {
            System.out.println("Final Notunuz 50'den Dusuk Oldugu icin Dersten Kaldiniz "
                    + "Daha Cok Calismalisiniz!");
        }
    }

    
}
