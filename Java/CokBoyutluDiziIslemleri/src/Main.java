
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int satir,sutun;
        
        System.out.println("Cok Boyutlu Dizi Islemleri Programi\n");
        System.out.println("*************************************");
        String islemler = "1-Cok Boyutlu Dizi Olusturma\n"
                + "2-2 Adet Cok Boyutlu Dizi Islemleri\n"
                + "q-Uygulamadan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                System.out.print("Dizinin Satir Sayisini Giriniz= ");
                satir = scanner.nextInt();
                
                System.out.print("Dizinin Sutun Sayisini Giriniz= ");
                sutun = scanner.nextInt();
                scanner.nextLine();
                
                int dizi[][] = new int [satir][sutun];
                
                for (int i=0;i<satir;i++)
                {
                    for (int j=0;j<sutun;j++)
                    {
                        System.out.print("[" + i + "]" + "[" + j + "]= ");
                        dizi[i][j] = scanner.nextInt();
                        scanner.nextLine();
                    }
                }
                
                System.out.println("Dizi Basari Ile Olusturuldu.");
                System.out.println("Olusturulan Dizi :");
                
                for (int i=0;i<satir;i++)
                {
                    for (int j=0;j<sutun;j++)
                    {
                        System.out.print(dizi[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
            else if (islem.equals("2"))
            {
                System.out.print("Dizinin Satir Sayisini Giriniz= ");
                satir = scanner.nextInt();
                
                System.out.print("Dizinin Sutun Sayisini Giriniz= ");
                sutun = scanner.nextInt();
                scanner.nextLine();
                
                int dizi1[][] = new int [satir][sutun];
                int dizi2[][] = new int [satir][sutun];
                
                for (int i=0;i<satir;i++)
                {
                    for (int j=0;j<sutun;j++)
                    {
                        System.out.print("1.Dizinin " + "[" + i + "]" + "[" + j + "]= ");
                        dizi1[i][j] = scanner.nextInt();
                        
                        System.out.print("2.Dizinin " + "[" + i + "]" + "[" + j + "]= ");
                        dizi2[i][j] = scanner.nextInt();
                        scanner.nextLine();
                        
                    }
                }
                
                System.out.println("Diziler Basari Ile Olusturuldu.");
                System.out.println("Olusturulan Diziler :");
                
                System.out.println("Olusturulan 1.Dizi= ");
                
                for (int i=0;i<satir;i++)
                {
                    for (int j=0;j<sutun;j++)
                    {
                        System.out.print(dizi1[i][j] + " ");
                    }
                    System.out.println("");
                }
                
                System.out.println("Olusturulan 2.Dizi= ");
                for (int i=0;i<satir;i++)
                {
                    for (int j=0;j<sutun;j++)
                    {
                        System.out.print(dizi2[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("**********************************");
                
                while (true)
                {
                    System.out.println("1-Olusturulan Cok Boyutlu Dizileri Topla");
                    System.out.println("2-Olusturulan Cok Boyutlu Dizileri Cikar");
                    System.out.println("3-Olusturulan Cok Boyutlu Dizileri Carp");
                    System.out.println("q-Cok Boyutlu Dizi Islemlerinden Cik!");
                    System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
                    String dIslemi = scanner.nextLine();
                    
                    if (dIslemi.equals("1"))
                    {
                        int toplam[][] = new int [satir][sutun];
                        
                        for (int i=0;i<satir;i++)
                        {
                            for (int j=0;j<sutun;j++)
                            {
                                toplam[i][j] = dizi1[i][j] + dizi2[i][j]; 
                            }
                        }
                        
                        System.out.println("Dizilerin Toplami Islemi Sonucu :");
                        
                        for (int i=0;i<satir;i++)
                        {
                            for (int j=0;j<sutun;j++)
                            {
                                System.out.print(toplam[i][j] + " ");
                            }
                            System.out.println("");
                        }
                        System.out.println("\n");
                    }
                    else if (dIslemi.equals("2"))
                    {
                        int cikarma[][] = new int [satir][sutun];
                        
                        for (int i=0;i<satir;i++)
                        {
                            for (int j=0;j<sutun;j++)
                            {
                                cikarma[i][j] = dizi1[i][j] - dizi2[i][j]; 
                            }
                        }
                        
                        System.out.println("Dizilerin Cikarma Islemi Sonucu :");
                        
                        for (int i=0;i<satir;i++)
                        {
                            for (int j=0;j<sutun;j++)
                            {
                                System.out.print(cikarma[i][j] + " ");
                            }
                            System.out.println("");
                        }
                        System.out.println("\n");
                    }
                    else if (dIslemi.equals("3"))
                    {
                        int carpma[][] = new int [satir][sutun];
                        
                        for (int i=0;i<satir;i++)
                        {
                            for (int j=0;j<sutun;j++)
                            {
                                carpma[i][j] = dizi1[i][j] * dizi2[i][j]; 
                            }
                        }
                        
                        System.out.println("Dizilerin Carpma Islemi Sonucu :");
                        
                        for (int i=0;i<satir;i++)
                        {
                            for (int j=0;j<sutun;j++)
                            {
                                System.out.print(carpma[i][j] + " ");
                            }
                            System.out.println("");
                        }
                        System.out.println("\n");
                    }
                    else if (dIslemi.equals("q"))
                    {
                        System.out.println("Cok Boyutlu Dizi Islemleri Bolumundan Cikis Yapiliyor...");
                        break;
                    }
                    else
                    {
                        System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz!");
                    }
                }     
            }
            else if (islem.equals("q"))
            {
                System.out.println("Uygulamadan Cikis Yapiliyor...");
                break;
            }
            else 
            {
                System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz!");
            }
        }
    }   
}
