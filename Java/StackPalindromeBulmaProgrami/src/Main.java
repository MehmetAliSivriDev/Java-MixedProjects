
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cumleyi Giriniz= ");
        String cumle = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i=0;i<cumle.length() / 2;i++)
        {
           stack.push(cumle.charAt(i));
        }
        
        boolean sonuc = false;
        
        for (int i=(cumle.length() / 2) + 1;i<cumle.length();i++)
        {
            
            if (cumle.charAt(i) == stack.pop())
            {
                sonuc = true;
            }
            else
            {
                sonuc = false;
            }
        }
        
        if (sonuc == true)
        {
            System.out.println("Bu Cumle Bir Palindrome Cumlesidir.");
        }
        else
        {
            System.out.println("Bu Cumle Palindrome Cumlesi Degildir.");
        }
                
    }
    
}
