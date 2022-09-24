
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {
        
        //Karin Agrisi Oncelik -> 1
        //Mide Yanmasi Oncelik -> 2
        //Kanser Oncelik -> 3
        
       Queue<Hasta> hastaKuyrugu = new PriorityQueue<Hasta>();
        
       hastaKuyrugu.add(new Hasta("Ahmet", "Kanser"));
       hastaKuyrugu.add(new Hasta("Selim", "Karin Agrisi"));
       hastaKuyrugu.add(new Hasta("Fatma", "Mide Yanmasi"));
       
       int sira =1;
       
       while (hastaKuyrugu.isEmpty() == false)
       {
           System.out.println("************************");
           System.out.println(sira + ". Sirada :");
           System.out.println(hastaKuyrugu.poll());
           sira++;
           System.out.println("************************");
       }
       
       
    }
    
}
