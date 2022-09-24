
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Kapılar kapilar = new Kapılar();
        Farlar farlar = new Farlar();
        motor motor = new motor();     
        Araba araba = new Araba("Renault", "Kirmizi", 10, motor , kapilar, farlar);
        String arabaIslemleri = "1-Motor Islemleri\n"
                + "2-Far Islemleri\n"
                + "3-Kapi Islemleri\n"
                + "4-Araba Bilgilerini Sorgulama\n"
                + "q-Uygulamadan Cikis Yapma\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
                
        while (true)
        {
            System.out.print(arabaIslemleri);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                System.out.print("Guncel Motor Durumu= ");
                if (araba.getMotor().isMotorDurumu() == true)
                {
                    System.out.println("Motor Acik Durumda.");
                }
                else
                {
                    System.out.println("Motor Kapali Durumda.");
                }
                
                System.out.print("1-Motor Ac\n"
                        + "2-Motor Kapat\n"
                        + "Uygulamak Istediginiz Islemi Giriniz= ");
                String motorIslemi = scanner.nextLine();
                
                if (motorIslemi.equals("1"))
                {
                    araba.getMotor().motorAc();
                }
                else if (motorIslemi.equals("2"))
                {
                    araba.getMotor().motorKapat();
                }
                else
                {
                    System.out.println("Hatali Giris Yaptiniz!");
                }
                
            }
            else if (islem.equals("2"))
            {
                System.out.print("1-Far Acma\n"
                        + "2-Far Kapatma\n"
                        + "Uygulamak Istediginiz Islemi Giriniz= ");
                String farIslemi = scanner.nextLine();
                
                if (farIslemi.equals("1"))
                {
                    araba.getFarlar().farAc();
                }
                else if (farIslemi.equals("2"))
                {
                    araba.getFarlar().farKapat();
                }
            }
            else if (islem.equals("3"))
            {
                System.out.print("1-Kapi Acma\n"
                        + "2-Kapi Kapatma\n"
                        + "Uygulamak Istediginiz Islemi Giriniz= ");
                String kapiIslemi = scanner.nextLine();
                
                if (kapiIslemi.equals("1"))
                {
                    araba.getKapilar().kapiAc();
                }
                else if (kapiIslemi.equals("2"))
                {
                    araba.getKapilar().kapiKapat();
                }
            }
            else if (islem.equals("4"))
            {
                System.out.println("Mevcut Araba Bilgileri:");
                System.out.println("Araba Markasi= " + araba.getArabaMarkasi());
                System.out.println("Araba Rengi= " + araba.getArabaRengi());
                System.out.println("Araba Yasi= " + araba.getArabaYasi());
            }
            else if (islem.equals("q"))
            {
                System.out.println("Uygulamadan Cikis Yapiliyor...");
                break;  
            }
            else
            {
                System.out.println("Hatali Giris Yaptiniz Tekrar Deneyiniz!");
            }
            
        }
    }
    
}
