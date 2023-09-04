package demo13_bingfa;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
/*
* 线程锁锁方法的时候1，调用方法会直接锁住类上面的方法，下面的方法也没办法调用
* 如果两个都没锁，会直接执行没有sleep的方法，但是sleep的方法会延到最后去调用
* synchronized
* synchronized修饰非静态方法，锁定的是方法的调用者
* synchronized修饰静态方法，锁定的是类
* synchronized静态方法与实例方法同时存在，静态方法锁定的是类，实例的方法锁对象
* synchronized自动上锁，自动释放锁，LOCK手动上锁，手动释放锁
* synchronized无法判断是否获取到了锁，lock可以判断是否拿到锁
* synchronized拿不到锁会一直等待，lock不一定会一直等，并且没有期限
* synchronized是jdk关键字实现的，lock是接口
* synchronized是非公平锁很公平，排队，当前线程需要判断队列种是否由其他等待锁，lock可以设置是否为公平锁，当前线程可以直接插队
* 实际开发中使用LOCK方式
* ReentranLock方式具有限时性的特点，可以判断某个线程在一定的时间点能否获取到锁，使用TryLock方法可以返回布尔类型的值
* true可以表示获取到锁，false表示无法获取到锁*/
public class fneli {
    public static void main(String[] args) {
        acount ac = new acount();
        acount ac2 = new acount();
        new Thread(ac::func1,"a").start();
        new Thread(ac::func2,"d").start();
        new Thread(ac::func3,"b").start();
    }
}
class acount {
    private int num = 0;
    public synchronized void func1(){
        num++;
        System.out.println(1);
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void func2(){
        System.out.println(2);
    }
    public void func3(){
        System.out.println(3);
    }
}