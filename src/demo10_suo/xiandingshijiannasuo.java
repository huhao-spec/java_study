package demo10_suo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class xiandingshijiannasuo {
    public static void main(String[] args) {
        Timelock Timelock = new Timelock();
        new Thread(Timelock::lock,"a").start();
        new Thread(Timelock::lock,"b").start();
    }
}
class Timelock{
    private ReentrantLock reentrantLock = new ReentrantLock();
    public void lock(){
        // 尝试在3秒内拿到锁
        try {
            if (reentrantLock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + "拿到锁了");
                TimeUnit.SECONDS.sleep(1);
            }else{
                System.out.println(Thread.currentThread().getName()+"拿锁失败");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }
}
