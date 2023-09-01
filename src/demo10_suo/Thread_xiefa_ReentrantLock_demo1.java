package demo10_suo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Thread_xiefa_ReentrantLock_demo1 {
    public static void main(String[] args) {
        Acount Acount1 = new Acount();
        // lamada支持函数接口调用形式
        new Thread(Acount1::count,"A").start();
        new Thread(Acount1::count,"B").start();
        new Thread(Acount1::count,"C").start();
        new Thread(Acount1::count,"D").start();
    }
}
class Acount{
    private final ReentrantLock ReentrantLock = new ReentrantLock();
    private static int num;
    public  void count(){
        ReentrantLock.lock();
        num++;
        // 为什么不休眠时候不会出错呢，这个是在并发的时候才会导致数据错误，调用下面这个方法的时候，上面线程已经走完了全程，
        // 没有发生并发状态的，
        try {
//                Thread.sleep(1000);//第一种休眠方式
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"是第"+num+"个访客");
        ReentrantLock.unlock();
    }
}


