
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> siralama = new ArrayList<Integer>();
        
        System.out.println("Programa Hos Geldiniz!");
        String islemler = "1-Sayisal Ogrencilerin Puanini Hesaplayip Siralama\n"
                + "2-Sozel Ogrencilerin Puanini Hesaplayip Siralama\n"
                + "q-Programdan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        System.out.println("UYARILAR:\n"
                + "En Yuksek Puan= 520\n"
                + "Sayisal Ogrencilerin Puanini Hesapladiktan Sonra Sozel Ogrencide Hesaplanabilir"
                + "ve Hepsi Bir Puan Siralamasina Tabi Tutulup Siralanir.");
        
        System.out.print("Tek Seferde Tek Bolumden Kac Ogrenci Hesaplamak Istediginizi Giriniz= ");
        int boyut = scanner.nextInt();
        scanner.nextLine();
        
        String[] isim = new String[boyut];
        int[] mat = new int[boyut];
        int[] trk = new int[boyut];
        int[] sos = new int[boyut];
        int[] fen = new int[boyut];
        
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("q"))
            {
                System.out.println("Programnda Cikis Yapiliyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                for (int i=0;i < boyut;i++)
                {
                    System.out.print((i+1) + ".Ogrencinin Ismini Giriniz= ");
                    isim[i] = scanner.nextLine();
            
                    System.out.print((i+1) + ".Ogrencinin Matematik Netini Giriniz= ");
                    mat[i] = scanner.nextInt();
            
                    System.out.print((i+1) + ".Ogrencinin Turkce Netini Giriniz= ");
                    trk[i] = scanner.nextInt();
            
                    System.out.print((i+1) + ".Ogrencinin Sosyal Netini Giriniz= ");
                    sos[i] = scanner.nextInt();
            
                    System.out.print((i+1) + ".Ogrencinin Fen Netini Giriniz= ");
                    fen[i] = scanner.nextInt();
                    scanner.nextLine();
            
                    Sayisal sayisal = new Sayisal(isim[i], mat[i], trk[i], sos[i], fen[i]);
                    System.out.println("Ogrencinin Aldigi Puan= " + sayisal.puanHesapla());
                    siralama.add(sayisal.puanHesapla());
                }  
                
                
                Collections.sort(siralama, Collections.reverseOrder());
                
                int sira = 0;
                
                for (int a : siralama)
                {
                    sira +=1;
                    System.out.println(sira + ".Ogrenci= " + a);
                }
            }
            else if (islem.equals("2"))
            {
                for (int i=0;i < boyut;i++)
                {
                    System.out.print((i+1) + ".Ogrencinin Ismini Giriniz= ");
                    isim[i] = scanner.nextLine();
            
                    System.out.print((i+1) + ".Ogrencinin Matematik Netini Giriniz= ");
                    mat[i] = scanner.nextInt();
            
                    System.out.print((i+1) + ".Ogrencinin Turkce Netini Giriniz= ");
                    trk[i] = scanner.nextInt();
            
                    System.out.print((i+1) + ".Ogrencinin Sosyal Netini Giriniz= ");
                    sos[i] = scanner.nextInt();
            
                    System.out.print((i+1) + ".Ogrencinin Fen Netini Giriniz= ");
                    fen[i] = scanner.nextInt();
                    scanner.nextLine();
            
                    Sozel sozel = new Sozel(isim[i], mat[i], trk[i], sos[i], fen[i]);
                    System.out.println("Ogrencinin Aldigi Puan= " + sozel.puanHesapla());
                    siralama.add(sozel.puanHesapla());
                }  
                
                
                Collections.sort(siralama, Collections.reverseOrder());
                
                int sira = 0;
                
                for (int a : siralama)
                {
                    sira +=1;
                    System.out.println(sira + ".Ogrenci= " + a);
                }
            
            }
        }
        
    }
    
}
