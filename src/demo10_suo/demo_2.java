package demo10_suo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class demo_2 {
    public static void main(String[] args) {
        Acount_num acountNum1 = new Acount_num();
        // lamada支持函数接口调用形式
        new Thread(acountNum1::count,"A").start();
        new Thread(acountNum1::count,"B").start();
        new Thread(acountNum1::count,"C").start();
        new Thread(acountNum1::count,"D").start();
    }
}
class Acount_num {
    private static Integer id = 0;
    private static Integer num=0;
    // synchronized用int基本类型是不能用的，只能锁类
    // 并且synchronized只能锁一个不变的对象，如果对象值变了，是在堆内存里面变得，这样两个就不是一个对象
    // 所以synchronized锁不住，只能锁一个不会变的东西
    public void count(){
        synchronized (id){
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
    }}
}



