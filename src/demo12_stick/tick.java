package demo12_stick;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class tick {
    // 卖剩下的票
    private int surplusCount = 15;
    // 卖出去的票
    private int outCount = 0;
    private final ReentrantLock lock = new ReentrantLock();
    public  void sold(){
        // 锁放在while循环外面跟在里面有不同的效果，

        while (outCount<=15){

            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            lock.lock();
            surplusCount--;
            outCount++;
            if(outCount > 15){
                System.out.println(Thread.currentThread().getName()+"\t\t"+"把票卖完了");
            }else{
                System.out.println(Thread.currentThread().getName()+"\t\t"+"卖出去了第"+outCount+"张票");
            }
            lock.unlock();
        }

    }
}

