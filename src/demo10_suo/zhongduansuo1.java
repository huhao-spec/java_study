package demo10_suo;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class zhongduansuo1 {
    public static void main(String[] args) {
        StopLock StopLock = new StopLock();
        Thread t1 = new Thread(StopLock::service,"A");
        Thread t2 = new Thread(StopLock::service,"B");

        t1.start();
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(1);
            t2.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class StopLock{
    private ReentrantLock reentrantLock=new ReentrantLock();
    public void service(){
        try {
            reentrantLock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName()+"拿到锁");
            try {
                TimeUnit.MILLISECONDS.sleep(5000);
            } catch (InterruptedException ee) {
                throw new RuntimeException(ee);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            reentrantLock.unlock();
        }

    }
}
