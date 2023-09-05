package JUC_gongjulei;

import java.util.concurrent.CountDownLatch;

public class demo_CountDownLatch {
    // 一个减法计数器，可以用来计时，当两个线程同时执行的时候，如果要确保一个线程优先执行
    // 可以用计数器，当数清零的时候再让拎一个线程执行
    public static void main(String[] args) {
        CountDownLatch co = new CountDownLatch(100);

        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("+++++++++++++++++++++++++++++"+Thread.currentThread().getName());
                co.countDown();
            }},"A").start();

            try {
                co.await();//这个是激活计数器，让计数器走完了在激活剩下的线程

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        for (int i = 0; i < 100; i++) {
            System.out.println("=============================="+Thread.currentThread().getName());
        }
    }
}
