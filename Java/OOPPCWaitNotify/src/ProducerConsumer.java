
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
    
    Random r = new Random();
    
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<Integer>();
    private int sizeLimit = 10;
    
    public void produce()
    {
        while (true)
        {
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            synchronized (lock) 
            {
                
                if (queue.size() == sizeLimit)
                {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                int value = r.nextInt(100);
                queue.offer(value);               
                System.out.println("Producer Uretme Islemi Gerceklestiriyor : " + value);
                lock.notify();
                
            }
            
        } 
        
    }
    
    public void consumer()
    {
        while (true)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            synchronized (lock) 
            {
                
                if (queue.size() == 0)
                {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                int value = queue.poll();
                
                System.out.println("Consumer Tuketme Islemi Gerceklestiriyor : " + value);
                System.out.println("Queue Size : " + queue.size());
                            
                    
            }
            
        }
    }
            
    
    
}
