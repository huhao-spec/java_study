package demo13_bingfa;

import java.util.concurrent.locks.ReentrantLock;

public class kezhongduansuo {
    public static void main(String[] args) {

    }
}
class Kezhongduan{
    private ReentrantLock lock = new ReentrantLock();
    public void getlock(){
        try {
            lock.lockInterruptibly();//可中断锁
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}
