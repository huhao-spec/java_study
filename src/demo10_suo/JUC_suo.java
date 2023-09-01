package demo10_suo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class JUC_suo {
    // java中的一个Java.util.concurent包
    // Lock是一个接口，用来实现线程同步，功能与Synchronized一样
    // Lock使用频率最高的实现类是ReentrantLock(重入锁)，可以重复上锁的东西。
    // ReentrantLock是一个类，而Synchronized是一个关键字
    // ReentrantLock是JDK实现的，而synchronized是JVM实现的
    // 1不能自动解锁，需要手动解锁，而2可以实现自动解锁
    // 公平锁与非公平锁
    // 公平锁；都得排队，非公平锁：可以插队
    public static void main(String[] args) {
//        System.err.println(1);
//        try {
//            Thread.currentThread().sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//          // 完成休眠的两种方式
//        try {
//            TimeUnit.SECONDS.sleep(1000);
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        System.err.println(2);
        Acount Acount = new Acount();
        new Thread(Acount,"A").start();
        new Thread(Acount,"B").start();
}
    static class Acount implements Runnable{
    private static int num;
//    private Lock Lock = new ReentrantLock();
        /**
         * 这就是普通的一个类
         * 用ReentrantContext()方法来实现线程锁
         */
        @Override
        public  void run() {
//            Lock.lock();
            num++;
            System.out.println("这是今天第"+num+"位访客");
//            Lock.unlock();
            //
        }
    }
}
