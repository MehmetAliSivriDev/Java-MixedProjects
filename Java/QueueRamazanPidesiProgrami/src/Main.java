
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Queue<String> pideKuyrugu = new LinkedList<String>();
        
        int pideSayisi = 0;
        
        pideKuyrugu.offer("Ahmet");
        pideKuyrugu.offer("Selim");
        pideKuyrugu.offer("Ronaldo");
        pideKuyrugu.offer("Messi");
        pideKuyrugu.offer("Hagi");
        pideKuyrugu.offer("Senijder");
        pideKuyrugu.offer("Ali");
        pideKuyrugu.offer("Sabri");
        pideKuyrugu.offer("Serdar");
        pideKuyrugu.offer("Akif");
        
        System.out.println("Pide Kuyrugu Programi!");
        System.out.println("\nKuyrukta Olan Insan Sirasi= " + pideKuyrugu.size());
        System.out.println("Firinda Mevcut Pide Sayisi= " + pideSayisi);
        
        String islemler = "1-Pide Cikart!\n"
                + "2-Pideyi Dagit\n"
                + "q-Programdan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                pideSayisi = random.nextInt(10) + 1;
                
                System.out.println("Pide Cikartiliyor...");
                Thread.sleep(3000);
                
                System.out.println("Mevcut Pide Sayisi= " + pideSayisi);
            }
            else if (islem.equals("2"))
            {
                if (pideSayisi == 0)
                {
                    System.out.println("Firinda Pide Yok!");
                }
                else
                {
                    while (pideSayisi !=0)
                    {   
                        pideSayisi -=1;
                        
                        System.out.println(pideKuyrugu.poll() + " Adli Musteriye Pide Veriliyor.");
                        Thread.sleep(1000);
                        
                        if (pideKuyrugu.size() == 0)
                        {
                            System.out.println("Kuyruktaki Tum Musterilere Pide Verildi.");
                            break;
                        }
                    }
                    System.out.println("Mevcut Tum Pideler Dagitildi!");
                }
            }
            else if (islem.equals("q"))
            {
                System.out.println("Programdan Cikis Yapiliyor...");
                break;
            }
        }
        
    }
}
