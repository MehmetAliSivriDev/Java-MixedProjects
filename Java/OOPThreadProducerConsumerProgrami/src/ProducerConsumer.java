
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
    
    Random r = new Random();
    
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    
    public void produce()
    {
        
        while(true)
        {
            try {
            Thread.sleep(1000);
            
            int value = r.nextInt(100);
            
            queue.put(value);
            
            System.out.println("Producer Ekleme Islemi Gerceklestiriyor : " + value);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    
    
    public void consumer()
    {
        
        while(true)
        {
            try {
            Thread.sleep(2000);
            
            int value = queue.take();
            
            
            System.out.println("Consumer Alma Islemi Gerceklestiriyor : " + value);
            
            System.out.println("Queue Size : " + queue.size());
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    
    
}
