package demo13_bingfa;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;


public class new_tick_test {
    public static void main(String[] args) {
        acount2 acount2 = new acount2();
        new Thread(acount2::conunt2,"A").start();
        new Thread(acount2::conunt2,"B").start();
    }
}

class acount2 {
    private int surplus=30;
    private int outTick=0;
    ReentrantLock RElock = new ReentrantLock();
    public void conunt2(){
        while (outTick<30) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            RElock.lock();
            surplus--;
            outTick++;
            if (surplus>=0){
                System.out.println(Thread.currentThread().getName() + "\t\t" + "卖出去了" + outTick + "张票,还剩余"+surplus+"张票");
            }else {
                System.out.println("票卖完了");
            }
            RElock.unlock();
        }
    }
}

