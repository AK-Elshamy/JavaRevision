package threadsystem;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReentrantLockClass {
    ReentrantLock lock = new ReentrantLock();

    public void print(int count){
       try{
           lock.lock();
           for(int i = 1; i <= 10; ++i){
               System.out.println(count*i);
                Thread.sleep(500);
           }
       }catch (InterruptedException ex){
           Logger.getLogger(ReentrantLockClass.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
           lock.unlock();
       }
    }
}
