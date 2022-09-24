
public class Main {
    
    public static void main(String[] args) {
        
    ATM atm = new ATM();
    
    HesapIslemleri hesap1 = new HesapIslemleri("Mehmet","1234",2000);
    
    atm.run(hesap1);
    
    System.out.println("Cikis Yapiliyor...");
        
    }
    
}
