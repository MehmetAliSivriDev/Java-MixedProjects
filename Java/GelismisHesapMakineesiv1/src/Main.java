
import java.util.Scanner;


public class Main {
    
    public static int toplama (int sayi1,int sayi2)
    {      
        return sayi1 + sayi2;
    }
    
    public static int toplama (int sayi1,int sayi2,int sayi3)
    {      
        return sayi1 + sayi2 + sayi3;
    }
    
    public static int cikarma (int sayi1,int sayi2)
    {      
        return sayi1 - sayi2;
    }
    
    public static double bolme (int sayi1, int sayi2) {
        
        return (double)(sayi1 / sayi2);
    }
    
    public static int carpma (int sayi1,int sayi2)
    {      
        return sayi1 * sayi2;
    }
    
    public static int carpma (int sayi1,int sayi2,int sayi3)
    {      
        return sayi1 * sayi2 * sayi3;
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int sayi1,sayi2,sayi3,islem;
        
        String islemler = "\n1-Toplama\n"
                + "2-Cikarma\n"
                + "3-Bolme\n"
                + "4-Carpma\n"
                + "5-Cikis Yap!\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        System.out.println("Gelismis Hesap Makinesi v1\n");
        
        while (true)
        {
            System.out.print(islemler);
            int  secim = scanner.nextInt();
            
            switch (secim)
            {
                case 1 :
                  
                    System.out.print("Kac Islem Toplamak Istiyorsunuz? (2-3)"
                            + "\n1- '2'"
                            + "\n2- '3'"
                            + "\nUygulamak Istediginiz Islemi Giriniz= ");
                    islem = scanner.nextInt();
                        
                        if (islem == 1)
                        {
                                System.out.print("Birinci Sayiyi Giriniz= ");
                                sayi1 = scanner.nextInt();
                                System.out.print("Ikinci Sayiyi Giriniz= ");
                                sayi2 = scanner.nextInt();
                                System.out.println("Sonuc= " + toplama(sayi1,sayi2));
                        }
                        else if (islem == 2)
                        {
                                    
                                System.out.print("Birinci Sayiyi Giriniz= ");
                                sayi1 = scanner.nextInt();
                                System.out.print("Ikinci Sayiyi Giriniz= ");
                                sayi2 = scanner.nextInt();
                                System.out.print("Ucuncu Sayiyi Giriniz= ");
                                sayi3 = scanner.nextInt();
                                System.out.println("Sonuc= " + toplama(sayi1,sayi2,sayi3));
                        }
                        else
                        {
                            System.out.println("Hatali Secim Yaptiniz!!");
                            break;
                        }
                        break;
                
                case 2 :
                    System.out.print("Birinci Sayiyi Giriniz= ");
                    sayi1 = scanner.nextInt();
                    System.out.print("Ikinci Sayiyi Giriniz= ");
                    sayi2 = scanner.nextInt();
                    System.out.println("Sonuc= " + cikarma(sayi1, sayi2));
                
                case 3 :
                    System.out.print("Birinci Sayiyi Giriniz= ");
                    sayi1 = scanner.nextInt();
                    System.out.print("Ikinci Sayiyi Giriniz= ");
                    sayi2 = scanner.nextInt();
                    System.out.println("Sonuc= " + bolme(sayi1, sayi2));
                    break;
                case 4 :
                    
                    System.out.print("Kac Islem Carpmak Istiyorsunuz? (2-3)"
                            + "\n1- '2'"
                            + "\n2- '3'"
                            + "\nUygulamak Istediginiz Islemi Giriniz= ");
                    islem = scanner.nextInt();
                        
                        if (islem == 1)
                        {
                                System.out.print("Birinci Sayiyi Giriniz= ");
                                sayi1 = scanner.nextInt();
                                System.out.print("Ikinci Sayiyi Giriniz= ");
                                sayi2 = scanner.nextInt();
                                System.out.println("Sonuc= " + carpma(sayi1,sayi2));
                        }
                        else if (islem == 2)
                        {
                                    
                                System.out.print("Birinci Sayiyi Giriniz= ");
                                sayi1 = scanner.nextInt();
                                System.out.print("Ikinci Sayiyi Giriniz= ");
                                sayi2 = scanner.nextInt();
                                System.out.print("Ucuncu Sayiyi Giriniz= ");
                                sayi3 = scanner.nextInt();
                                System.out.println("Sonuc= " + carpma(sayi1,sayi2,sayi3));
                        }
                        else
                        {
                            System.out.println("Hatali Secim Yaptiniz!!");
                            break;
                        }
                        break;
                        
                case 5 :
                    
                    System.out.println("Cikis Yapiliyor...");
                    System.exit(0);
            }
            
        }
        
        
        
    }
            
    
}
