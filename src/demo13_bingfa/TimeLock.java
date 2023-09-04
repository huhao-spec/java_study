package demo13_bingfa;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeLock {
    public static void main(String[] args) {
        lock lock= new lock();
        new Thread(lock::getLock,"A").start();
        new Thread(lock::getLock,"B").start();
    }

}
class lock{
    private ReentrantLock lock = new ReentrantLock();

    public void getLock() {

        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName()+"拿到了锁");
                try {
                    TimeUnit.MILLISECONDS.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                System.out.println(Thread.currentThread().getName()+"拿不到锁");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            if (lock.isHeldByCurrentThread()){//判断是不是当前线程创建的锁。在ReentrantLock里面的方法，通过
                lock.unlock();
            }
        }
    }
}
