
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1-Kendi Beyblade'ni Uret!\n"
                + "2-Var Olan Beybladelerden Uret!\n"
                + "q-Program'dan Cikis Yap!\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("**********************************");
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();              
                   
            if (islem.equals("1"))
            {
                System.out.println("KENDI BEYBLADENI URET PROGRAMINA HOSGELDINIZ!!");
                System.out.println("**********************************************");
            
                System.out.print("Beybladecinin Adini Giriniz= ");
                String beybladeci = scanner.nextLine();
            
                System.out.print("Kutsal Canavarinizin Adini Giriniz= ");
                String kutsalCanavar = scanner.nextLine();
            
                System.out.print("Beybladenizin Saldiri Gucunu Giriniz= ");
                int saldirigucu = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Beybladenizin Donus Hizini Giriniz= ");
                int donushizi = scanner.nextInt();
                scanner.nextLine();
            
                System.out.println("Beybladeniz Olusturuluyor...");
            
                String bilgiler = "Beybladeci= " + beybladeci + "\n"
                    + "Beyblade'nin Saldiri Gucu= " + saldirigucu + "\n"
                    + "Beyblade'nin Donus Hizi= " + donushizi + "\n"
                    + "Kutsal Canavarinin Adi= " + kutsalCanavar;
            
                System.out.println("Beybladeniz Olusturuldu!");
                System.out.println(bilgiler);
            }    
            else if (islem.equals("2"))
            {
                System.out.print("Olusturmak Istediginiz Beyblade'yi Giriniz(Dranza,Drayga,Dragon)= ");
                String tur = scanner.nextLine();
            
                BeybaldeFabrikasi fabrika = new BeybaldeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(tur);
            
                    if (fabrika.beybladeUret(tur) == null)
                    {
                        System.out.println("Hatali Giris Yaptiniz Sistemden Cikariliyorsunuz...");
                        break;
                    }
            
                    String beybladeislemleri = "1-Beyblade'nin Bilgilerini Goster\n"
                                             + "2-Saldir\n"
                                             + "3-Kutsal Canavari Ortaya Cikar\n"
                                             + "q-Cikis Yap!\n"
                                             + "Uygulamak Istediginiz Islemi Giriniz= ";
            
                System.out.println("Beyblade Olusturuldu...");

                while (true)
                {
                    System.out.print(beybladeislemleri);
                    String beybladeislemi = scanner.nextLine();
                
                        if (beybladeislemi.equals("1"))
                        {
                            beyblade.bilgileriGoster();
                        }
                        else if (beybladeislemi.equals("2"))
                        {
                            beyblade.Saldir();
                        }
                        else if (beybladeislemi.equals("3"))
                        {
                            beyblade.kutsalCanavarOrtayaCikar();
                        }
                        else if (beybladeislemi.equals("q"))
                        {
                            System.out.println("Cikis Yapiliyor...");
                            break;
                        }
                        else
                        {
                            System.out.println("Hatali Giris Yaptiniz...");
                        }
                }
            }
            else if (islem.equals("q"))
            {
                System.out.println("Program'dan Cikiliyor...");
                break;
            }
            else
            {
                System.out.println("Hatali Secim Yaptiniz...");
            }
        }
        
        
        
    }

    
}
