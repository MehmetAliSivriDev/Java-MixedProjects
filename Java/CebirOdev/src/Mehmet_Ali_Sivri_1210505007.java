
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class matrisException extends Exception
{
    public matrisException(String excpMesaji)
    {
        super(excpMesaji);
    }
}

public class Mehmet_Ali_Sivri_1210505007 {
  
    public static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args){
        
        try {
            String islemler = "MATRIS ISLEMLER PROGRAMINA HOS GELDINIZ\n"
                    + "***************************************\n"
                    + "1-Matrislerde Toplama Islemi\n"
                    + "2-Matrislerde Cikarma Islemi\n"
                    + "3-Matrislerde Carpma Islemi\n"
                    + "4-Matrisin Determinantini Hesaplama\n"
                    + "5-Matrisin Tersini Alma\n"
                    + "6-Matrisin Involutif Olup Olmadigini Kontrol Etme\n"
                    + "q-Uygulamadan Cikis Yap\n";
            
            System.out.println("***************************************");
            System.out.println(islemler);
            
            while(true)
            {

                System.out.print("Uygulamak Istediginiz Islemi Giriniz= ");
                String islem = scanner.nextLine();
                
                if (islem.equals("q"))
                {
                    System.out.println("Uygulamadan Cikis Yapiliyor...");
                    Thread.sleep(1000);
                    break;
                }
                else if (islem.equals("1"))
                {
                    matrisToplama();
                }
                else if (islem.equals("2"))
                {
                    matrisCikarma();
                }
                else if (islem.equals("3"))
                {
                    matrisCarpma();  
                }
                else if (islem.equals("4"))
                {
                    matrisDetarminant();
                }
                else if (islem.equals("5"))
                {
                    matrisTersiAlma();
                }
                else if (islem.equals("6"))
                {
                    matrisInvolutfiKontrol();
                }

        }
        
    }   catch (InterruptedException ex) {
            Logger.getLogger(Mehmet_Ali_Sivri_1210505007.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //***************************************************************************************************************
    /*
                  MATRISLERDE TOPLAMA ISLEMI
                                                                 */
    public static void matrisToplama() throws InterruptedException
    {
        System.out.print("1. Matris'in Satir Boyutunu Giriniz= ");
        int matris1Satir = scanner.nextInt();
        
        System.out.print("1. Matris'in Sutun Boyutunu Giriniz= ");
        int matris1Sutun = scanner.nextInt();
        
        int matris1 [][] = new int[matris1Satir][matris1Sutun];
        
        for(int i =0; i< matris1Satir;i++)
        {
            for(int j=0; j< matris1Sutun;j++)
            {
                System.out.print("1. Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                matris1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Olusturulan 1. Matris :");
        
        for(int i=0; i<matris1Satir;i++)
        {
            for(int j=0; j<matris1Sutun;j++)
            {
                System.out.print("|" + matris1[i][j] + "|");
            }
            System.out.println("");
        }
        
        System.out.print("2. Matris'in Satir Boyutunu Giriniz= ");
        int matris2Satir = scanner.nextInt();
        
        System.out.print("2. Matris'in Sutun Boyutunu Giriniz= ");
        int matris2Sutun = scanner.nextInt();
                
        if(matris1Satir == matris2Satir && matris1Sutun == matris2Sutun)
        {
            int matris2 [][] = new int[matris2Satir][matris2Sutun];
        
            for(int i =0; i< matris2Satir;i++)
            {
                for(int j=0; j< matris2Sutun;j++)
                {
                    System.out.print("2. Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                    matris2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Olusturulan 2. Matris :");

            for(int i=0; i<matris2Satir;i++)
            {
                for(int j=0; j<matris2Sutun;j++)
                {
                    System.out.print("|" + matris2[i][j] + "|");
                }
                System.out.println("");
            }
            
            System.out.println("Matrisleri Toplama Islemi Gerceklestiriliyor...");
            
            Thread.sleep(1000);
            
            int toplam [][] = new int [matris1Satir][matris1Sutun];
            
            for(int i=0; i<matris1Satir;i++)
            {
                for(int j=0; j<matris1Sutun;j++)
                {
                    toplam[i][j] = matris1[i][j] + matris2[i][j];
                }
            }
            
            System.out.println("Toplama Sonucu :");
            
            for(int i=0; i<matris1Satir;i++)
            {
                for(int j=0; j<matris1Sutun;j++)
                {
                    System.out.print("|" + toplam[i][j] + "|");
                }
                System.out.println("");
            }
            
        }
        else
        {
            try
            {
                String hataMesaji = "Matrisleri Toplamak Icin Boyutlari Esit Olmalidir!";
                throw new matrisException(hataMesaji);
                
            }
            catch(matrisException me)
            {
                me.printStackTrace();
                System.out.println("Lutfen Tekrar Deneyiniz!");
            }

        }
         
    }
    
    //***************************************************************************************************************
    /*
                  MATRISLERDE CIKARMA ISLEMI
                                                                 */
    public static void matrisCikarma() throws InterruptedException
    {
        System.out.print("1. Matris'in Satir Boyutunu Giriniz= ");
        int matris1Satir = scanner.nextInt();
        
        System.out.print("1. Matris'in Sutun Boyutunu Giriniz= ");
        int matris1Sutun = scanner.nextInt();
        
        int matris1 [][] = new int[matris1Satir][matris1Sutun];
        
        for(int i =0; i< matris1Satir;i++)
        {
            for(int j=0; j< matris1Sutun;j++)
            {
                System.out.print("1. Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                matris1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Olusturulan 1. Matris :");
        
        for(int i=0; i<matris1Satir;i++)
        {
            for(int j=0; j<matris1Sutun;j++)
            {
                System.out.print("|" + matris1[i][j] + "|");
            }
            System.out.println("");
        }
        
        System.out.print("2. Matris'in Satir Boyutunu Giriniz= ");
        int matris2Satir = scanner.nextInt();
        
        System.out.print("2. Matris'in Sutun Boyutunu Giriniz= ");
        int matris2Sutun = scanner.nextInt();
                
        if(matris1Satir == matris2Satir && matris1Sutun == matris2Sutun)
        {
            int matris2 [][] = new int[matris2Satir][matris2Sutun];
        
            for(int i =0; i< matris2Satir;i++)
            {
                for(int j=0; j< matris2Sutun;j++)
                {
                    System.out.print("2. Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                    matris2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Olusturulan 2. Matris :");

            for(int i=0; i<matris2Satir;i++)
            {
                for(int j=0; j<matris2Sutun;j++)
                {
                    System.out.print("|" + matris2[i][j] + "|");
                }
                System.out.println("");
            }
            
            System.out.println("Matrisleri Cikarma Islemi Gerceklestiriliyor...");
            
            Thread.sleep(1000);
            
            int cikarma [][] = new int [matris1Satir][matris1Sutun];
            
            for(int i=0; i<matris1Satir;i++)
            {
                for(int j=0; j<matris1Sutun;j++)
                {
                    cikarma[i][j] = matris1[i][j] - matris2[i][j];
                }
            }
            
            System.out.println("Cikarma Sonucu :");
            
            for(int i=0; i<matris1Satir;i++)
            {
                for(int j=0; j<matris1Sutun;j++)
                {
                    System.out.print("|" + cikarma[i][j] + "|");
                }
                System.out.println("");
            }
            
        }
        else
        {
             try
            {
                String hataMesaji = "Matrisleri Cikarmak Icin Boyutlari Esit Olmalidir!";
                throw new matrisException(hataMesaji);
                
            }
            catch(matrisException me)
            {
                me.printStackTrace();
                System.out.println("Lutfen Tekrar Deneyiniz!");
            }
        }
    }
    
    //***************************************************************************************************************
    /*
                  MATRISLERDE CARPMA ISLEMI
                                                                 */
    public static void matrisCarpma() throws InterruptedException
    {
        String secenekler = "1-Bir Sabit Sayi ile Bir Matris'i Carpma\n"
                + "2-Bir Matris ile Baska Bir Matrisi Carpma\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        System.out.print(secenekler);
        String islem = scanner.nextLine();
        
        if(islem.equals("1"))
        {
            System.out.print("Matris'in Satir Boyutunu Giriniz= ");
            int matrisSatir = scanner.nextInt();

            System.out.print("Matris'in Sutun Boyutunu Giriniz= ");
            int matrisSutun = scanner.nextInt();

            int matris [][] = new int[matrisSatir][matrisSutun];

            for(int i =0; i< matrisSatir;i++)
            {
                for(int j=0; j< matrisSutun;j++)
                {
                    System.out.print("Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                    matris[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Olusturulan Matris :");

            for(int i=0; i<matrisSatir;i++)
            {
                for(int j=0; j<matrisSutun;j++)
                {
                    System.out.print("|" + matris[i][j] + "|");
                }
                System.out.println("");
            }
            
            System.out.println("Matris'i Carpmak Istediginiz Sabit Sayiyi Giriniz= ");
            int sayi = scanner.nextInt();
            
            int carpma [][] = new int [matrisSatir][matrisSutun]; 
            
            for(int i=0; i<matrisSatir;i++)
            {
                for(int j=0; j<matrisSutun;j++)
                {
                    carpma[i][j] = matris[i][j] * sayi;
                }
            }
            
            System.out.println("Carpma Sonucu :");
            
            for(int i=0; i<matrisSatir;i++)
            {
                for(int j=0; j<matrisSutun;j++)
                {
                    System.out.print("|" + carpma[i][j] + "|");
                }
                System.out.println("");
            }
            
        }
        else if (islem.equals("2"))
        {
            System.out.print("1. Matris'in Satir Boyutunu Giriniz= ");
            int matris1Satir = scanner.nextInt();

            System.out.print("1. Matris'in Sutun Boyutunu Giriniz= ");
            int matris1Sutun = scanner.nextInt();
            
            int matris1 [][] = new int[matris1Satir][matris1Sutun]; 
            
            for(int i =0; i< matris1Satir;i++)
            {
                for(int j=0; j< matris1Sutun;j++)
                {
                    System.out.print("1. Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                    matris1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Olusturulan 1. Matris :");

            for(int i=0; i<matris1Satir;i++)
            {
                for(int j=0; j<matris1Sutun;j++)
                {
                    System.out.print("|" + matris1[i][j] + "|");
                }
                System.out.println("");
            }

            System.out.print("2. Matris'in Satir Boyutunu Giriniz= ");
            int matris2Satir = scanner.nextInt();

            System.out.print("2. Matris'in Sutun Boyutunu Giriniz= ");
            int matris2Sutun = scanner.nextInt();
            
            if(matris1Sutun == matris2Satir)
            {
                int matris2 [][] = new int[matris2Satir][matris2Sutun];

                for(int i =0; i< matris2Satir;i++)
                {
                    for(int j=0; j< matris2Sutun;j++)
                    {
                        System.out.print("2. Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                        matris2[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("Olusturulan 2. Matris :");

                for(int i=0; i<matris2Satir;i++)
                {
                    for(int j=0; j<matris2Sutun;j++)
                    {
                        System.out.print("|" + matris2[i][j] + "|");
                    }
                    System.out.println("");
                }

                System.out.println("Matrisleri Carpma Islemi Gerceklestiriliyor...");

                Thread.sleep(1000);

                int carpma [][] = new int [matris1Satir][matris2Sutun];
                int deger = 0;
                
                for(int i=0; i<matris1Satir;i++)
                {
                    for(int j=0; j<matris2Sutun;j++)
                    {
                        for(int k=0; k<matris1Sutun;k++)
                        {
                            deger += matris1[i][k] * matris2[k][j];
                        }
                        carpma[i][j] = deger;
                        deger = 0;
                    }
                    
                }

                System.out.println("Carpma Sonucu :");

                for(int i=0; i<matris1Satir;i++)
                {
                    for(int j=0; j<matris2Sutun;j++)
                    {
                        System.out.print("|" + carpma[i][j] + "|");
                    }
                    System.out.println("");
                }
            }
            else
            {
                try
                {
                    String hataMesaji = "Matrisler Arasi Carpma Islemi Gerceklestirebilmek Icin"
                            + "1. Matris'in Sutun'u ile 2. Matris'in Satir Boyutu Esit Olmalidir!!";
                    throw new matrisException(hataMesaji);  
                }
                catch(matrisException me)
                {
                    me.printStackTrace();
                    System.out.println("Lutfen Tekrar Deneyiniz!");
                }

            }
            
        }
        else
        {
            System.out.println("Hatali Giris Yaptiniz Lutfen Tekrar Deneyiniz!");
        }
      }
    
    //***************************************************************************************************************
    /*
            MATRISIN DETARMINANTINI HEASPLAMA ISLEMI
                                                                 */
    public static void matrisDetarminant()throws InterruptedException
    {
        int matris [][] = new int[3][3];

        for(int i =0; i< 3;i++)
        {
            for(int j=0; j< 3;j++)
            {
                    System.out.print("Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                    matris[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Olusturulan Matris :");

        for(int i=0; i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
                System.out.print("|" + matris[i][j] + "|");
            }
            System.out.println("");
        }
        
        System.out.println("Matris'in Detarminanti Hesaplaniyor...");
        Thread.sleep(1000);
        
        int [][] yeniMatris = new int [3][5];
        
         for(int i=0; i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
                yeniMatris[i][j] += matris[i][j];
            }
        }
        
        for(int i=0; i<3;i++)
        {
            
            for(int j=0;j<2;j++)
            {
                yeniMatris[i][j+3] += matris[i][j];
            }
        }
        
        System.out.println("3x3'luk Bir Matrisin Detarminantini Hesaplamak Icin Olusturulan Yeni Matris :");
        
        for(int i=0; i<3;i++)
        {
            for(int j=0; j<5;j++)
            {
                System.out.print("|" + yeniMatris[i][j] + "|");
            }
            System.out.println("");
        }
        
        int detarminant = ((yeniMatris[0][0] * yeniMatris[1][1] * yeniMatris[2][2]) + (yeniMatris[0][1] * yeniMatris[1][2] * yeniMatris[2][3]) +
            (yeniMatris[0][2] * yeniMatris[1][3] * yeniMatris[2][4])) - (yeniMatris[0][4] * yeniMatris[1][3] * yeniMatris[2][2]) -    
            (yeniMatris[0][3] * yeniMatris[1][2] * yeniMatris[2][1]) - (yeniMatris[0][2] * yeniMatris[1][1] * yeniMatris[2][0]);

        System.out.println("Girdiginiz Matris'in Detarminanti= " + detarminant); 
    }
    
    //***************************************************************************************************************
    /*
                    MATRISIN TERSINI ALMA ISLEMI
                                                                 */
    public static void matrisTersiAlma() throws InterruptedException{
                
        
        System.out.print("Matris'in Satir Boyutunu Giriniz= ");
        int matrisSatir = scanner.nextInt();

        System.out.print("Matris'in Sutun Boyutunu Giriniz= ");
        int matrisSutun = scanner.nextInt();

        float matris [][] = new float[matrisSatir][matrisSutun];

        for(int i =0; i< matrisSatir;i++)
        {
            for(int j=0; j< matrisSutun;j++)
            {
                System.out.print("Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                matris[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Olusturulan Matris :");

        for(int i=0; i<matrisSatir;i++)
        {
            for(int j=0; j<matrisSutun;j++)
            {
                System.out.print("|" + matris[i][j] + "|");
            }
            System.out.println("");
        }
            
        System.out.println("Matris'in Tersi Hesaplaniyor...");
        Thread.sleep(1000);
        
        float yMatris1[][] = new float[matrisSatir][matrisSutun];
        
        for(int i=0; i<matrisSatir; i++)
        {
            for(int j=0; j<matrisSutun; j++)
            {
                if(i==j)
                {
                    yMatris1[i][j] = 1;
                }
                else
                {
                    yMatris1[i][j] = 0;
                }
            }
        }
        
        float deger1,deger2;
        
        for(int i=0; i<matrisSatir; i++)
        {
            deger1 = matris[i][i];
            
             for(int j=0; j<matrisSutun; j++)
             {
                 matris[i][j] = (matris[i][j] / deger1);
                 yMatris1[i][j] = yMatris1[i][j]/deger1;
                 
             }
             for(int k=0; k<matrisSatir; k++)
             {
                 if(k!=i)
                 {
                    deger2 = matris[k][i];
                    
                    for(int j=0; j<matrisSutun; j++)
                    {
                        matris[k][j] = matris[k][j] - (matris[i][j]*deger2);
                        yMatris1[k][j] = yMatris1[k][j] - (yMatris1[i][j]*deger2);
                    }
                 }
                 
             }
        }
        
        System.out.println("Girdiginiz Matrisin Ters Hali :");
        for(int i=0; i<matrisSatir; i++)
        {
            for(int j=0; j<matrisSutun; j++)
            {
                System.out.printf("|" + yMatris1[i][j] + "|");
            }
            System.out.println("");
        }
          
    }
    
    //***************************************************************************************************************
    /*
        MATRIS INVOLUTIF OLUP OLMADIGINI KONTROL ETME ISLEMI
                                                                 */
    public static void matrisInvolutfiKontrol() throws InterruptedException
    {
        String uyari = "UYARI!!\n"
                + "Involutif Kontrol Yaparken Matris'in Karesi Alinacagindan ve Matris Carpma Kurallari Dikkate Alindigi "
                + "icin \nBu Hesaplama Isleminde Matris Kare Matris Olmasi Gerekmektedir."
                + " Bu Yuzden Tek Boyut Istenmistir.";
        
        System.err.println(uyari);
        
        System.out.print("Matris'in Boyutunu Giriniz= ");
        int matrisBoyut = scanner.nextInt();


        int matris [][] = new int[matrisBoyut][matrisBoyut];

        for(int i =0; i< matrisBoyut;i++)
        {
            for(int j=0; j< matrisBoyut;j++)
            {
                System.out.print("Matris'in [" + (i+1) + "][" + (j+1) + "]" + " Degeri= ");
                matris[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Olusturulan Matris :");

        for(int i=0; i<matrisBoyut;i++)
        {
            for(int j=0; j<matrisBoyut;j++)
            {
                System.out.print("|" + matris[i][j] + "|");
            }
            System.out.println("");
        }
        
        int [][] birimMatris = new int [matrisBoyut][matrisBoyut];
        
        for(int i=0;i<matrisBoyut;i++)
        {
            for(int j=0;j<matrisBoyut;j++)
            {
                if(i == j)
                {
                    birimMatris[i][j] = 1;
                }
                else
                {
                    birimMatris[i][j] = 0;
                }
            }
        }
                
        System.out.println("Birim Matris :");

        for(int i=0; i<matrisBoyut;i++)
        {
            for(int j=0; j<matrisBoyut;j++)
            {
                System.out.print("|" + birimMatris[i][j] + "|");
            }
            System.out.println("");
        }
 
        System.out.println("Hesaplamalar Yapiliyor...");
        Thread.sleep(1000);
        
        int deger = 0;
        int [][] karesi = new int [matrisBoyut][matrisBoyut];
                
        for(int i=0; i<matrisBoyut;i++)
        {
            for(int j=0; j<matrisBoyut;j++)
            {
                for(int k=0; k<matrisBoyut;k++)
                {
                    deger += matris[i][k] * matris[k][j];
                }
                karesi[i][j] = deger;
                deger = 0;
            }
            
        }
        
        System.out.println("Girmis Oldugunuz Matris'in Karesi :");

        for(int i=0; i<matrisBoyut;i++)
        {
            for(int j=0; j<matrisBoyut;j++)
            {
                System.out.print("|" + karesi[i][j] + "|");
            }
            System.out.println("");
        }
        
        System.out.println("Girmis Oldugunuz Matris'in Karesi ile Birim Matris Karsilastiriliyor...");
        Thread.sleep(1000);
        
        if (matrisEsitMi(karesi,birimMatris,matrisBoyut))
        {
            System.out.println("Girmis Oldugunuz Matris Bir Involutif Matristir!!");
        }
        else
        {
            System.out.println("Girmis Oldugunuz Matris Bir Involutif Matris Degildir!!");
        }
        
    }
    
    public static boolean matrisEsitMi(int[][] matris1,int[][]matris2,int matrisBoyut)
    {
        
        boolean cevap = false;
        
        for(int i=0; i<matrisBoyut;i++)
        {
            for(int j=0; j<matrisBoyut;j++)
            {
                if(matris1[i][j] == matris2[i][j])
                {
                    cevap = true;
                }
                else
                {
                    cevap = false;
                }
            }
        }
        
        return cevap;
    }
      
}
