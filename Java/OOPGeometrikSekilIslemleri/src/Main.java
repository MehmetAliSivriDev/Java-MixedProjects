
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Sekil sekil = null;
        
        System.out.println("Geometrik Sekil Islemleri Programina Hos Geldiniz!");
        
        String islemler = "1-Kare Islemleri\n"
                + "2-Ucgen Islemleri\n"
                + "3-Daire Islemleri\n"
                + "q-Programdan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        boolean cikis = true;
        
        while (cikis)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            switch (islem)
            {
                case "1" :
                    
                    System.out.println("Kare Islemleri Sekmesine Hos Geldiniz!\n");
                    
                    while (true)
                    {
                        System.out.println("1-Alan Hesaplama");
                        System.out.println("2-Cevre Hesaplama");
                        System.out.println("q-Kare Islemleri Sekmesinden Cikis Yap");
                        System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
                        String kareislemi = scanner.nextLine();
                        
                        if (kareislemi.equals("1"))
                        {
                            System.out.print("Bir Kenar Giriniz= ");
                            int kenar = scanner.nextInt();
                            scanner.nextLine();
                            sekil = new Kare("Kare", kenar);
                            sekil.alanHesapla();
                        }
                        else if (kareislemi.equals("2"))
                        {
                            System.out.print("Bir Kenar Giriniz= ");
                            int kenar = scanner.nextInt();
                            scanner.nextLine();
                            sekil = new Kare("Kare", kenar);
                            sekil.cevreHesapla();
                        }
                        else if (kareislemi.equals("q"))
                        {
                            System.out.println("Kare Islemleri Sekmesinden Cikartiliyorsunuz...");
                            break;                      
                        }
                        else 
                        {
                            System.out.println("Hatali Secim Yaptiniz...");
                        }
                    }
                    break;
                
                case "2" :
                    
                    System.out.println("Ucgen Islemleri Sekmesine Hos Geldiniz!\n");
                    
                    while (true)
                    {
                        System.out.println("1-Alan Hesaplama");
                        System.out.println("2-Cevre Hesaplama");
                        System.out.println("q-Ucgen Islemleri Sekmesinden Cikis Yap");
                        System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
                        String ucgenislemi = scanner.nextLine();
                        
                        if (ucgenislemi.equals("1"))
                        {
                            System.out.print("Birinci Kenari Giriniz= ");
                            int kenar1 = scanner.nextInt();
                            
                            System.out.print("Ikinci Kenari Giriniz= ");
                            int kenar2 = scanner.nextInt();
                            
                            System.out.print("Ucuncu Kenari Giriniz= ");
                            int kenar3 = scanner.nextInt();
                            scanner.nextLine();
                            sekil = new Ucgen("Ucgen", kenar1, kenar2, kenar3);
                            sekil.alanHesapla();
                        }
                        else if (ucgenislemi.equals("2"))
                        {
                            System.out.print("Birinci Kenari Giriniz= ");
                            int kenar1 = scanner.nextInt();
                            
                            System.out.print("Ikinci Kenari Giriniz= ");
                            int kenar2 = scanner.nextInt();
                            
                            System.out.print("Ucuncu Kenari Giriniz= ");
                            int kenar3 = scanner.nextInt();
                            scanner.nextLine();
                            sekil = new Ucgen("Ucgen", kenar1, kenar2, kenar3);
                            sekil.cevreHesapla();
                        }
                        else if (ucgenislemi.equals("q"))
                        {
                            System.out.println("Ucgen Islemleri Sekmesinden Cikartiliyorsunuz...");
                            break;                      
                        }
                        else 
                        {
                            System.out.println("Hatali Secim Yaptiniz...");
                        }
                    }
                    break;
                    
                case "3" : 
                    
                    System.out.println("Daire Islemleri Sekmesine Hos Geldiniz!\n");
                    
                    while (true)
                    {
                        System.out.println("1-Alan Hesaplama");
                        System.out.println("2-Cevre Hesaplama");
                        System.out.println("q-Kare Islemleri Sekmesinden Cikis Yap");
                        System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
                        String daireislemi = scanner.nextLine();
                        
                        if (daireislemi.equals("1"))
                        {
                            System.out.print("Dairenizin Yaricapini Giriniz= ");
                            double yaricap = scanner.nextDouble();
                            scanner.nextLine();
                            sekil = new Daire("Daire", yaricap);
                            sekil.alanHesapla();
                        }
                        else if (daireislemi.equals("2"))
                        {
                            System.out.print("Dairenizin Yaricapini Giriniz= ");
                            double yaricap = scanner.nextDouble();
                            scanner.nextLine();
                            sekil = new Daire("Daire", yaricap);
                            sekil.cevreHesapla();
                        }
                        else if (daireislemi.equals("q"))
                        {
                            System.out.println("Daire Islemleri Sekmesinden Cikartiliyorsunuz...");
                            break;                      
                        }
                        else 
                        {
                            System.out.println("Hatali Secim Yaptiniz...");
                        }
                    }
                    break;
                    
                case "q" :
                    
                    System.out.println("Sistemden Cikartiliyorsunuz...");
                    cikis = false;
            }
        }
            
        
        
    }
 
   
    
}
