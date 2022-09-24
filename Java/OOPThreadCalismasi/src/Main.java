
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1-Wait Notify Thread'ini Calistir\n"
                + "2-Await Signal Thread'ini Calistir\n"
                + "3-Karisik Calistirma (Semaphore)\n"
                + "q-Programdan Cikis Yap\n"
                + "Uygulamak Istediginiz Islemi Giriniz= ";
        
        while (true)
        {
            System.out.print(islemler);
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                waitNotify wn = new waitNotify();
                
                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        wn.birinciOyuncu();
                    }
                });
                
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        wn.ikinciOyuncu();                    
                    }
                });
                
                thread1.start();
                thread2.start();
                
                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (wn.sektirmeBittiMi() == true)
                {
                    System.out.println("Sektirme Islemi Tamamlandi.");
                }
                
            }
            if (islem.equals("2"))
            {
                awaitSignal as = new awaitSignal();
                
                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        as.birinciFirinci();
                    }
                });
                
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        as.ikinciFirinci();
                    }
                });
                
                thread1.start();
                thread2.start();
                
                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (as.firinDolduMu() == true)
                {
                    System.out.println("Firina Ekmek Atma Islemi Tamamlandi.");
                }
                
            }
            else if (islem.equals("3"))
            {
                semaphore sm = new semaphore();
                
                Thread thread1 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        sm.calistirma("Ahmet");
                    }
                });
                
                Thread thread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        sm.calistirma("Ridvan");
                    }
                });
                
                Thread thread3 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        sm.calistirma("Murat");
                    }
                });
                
                Thread thread4 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        sm.calistirma("Ali");
                    }
                });
                
                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();
                
                try {
                    thread1.join();
                    thread2.join();
                    thread3.join();
                    thread4.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                
                if (sm.isBittiMi() == true)
                {
                    System.out.println("Tum Is Basariyla Tamamlandi.");
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
