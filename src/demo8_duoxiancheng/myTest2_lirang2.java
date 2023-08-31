package demo8_duoxiancheng;

import java.security.spec.RSAOtherPrimeInfo;

public class myTest2_lirang2 {
    public static void main(String[] args) {
        Thread th_2 = new Thread(new Runnable() {//这就是创建了一个匿名内部类
            @Override
            public void run() {
                System.out.println(111);
            }
        });
        th_2.start();
//        System.out.println(th_2.getState());
//        System.out.println(th_2.isInterrupted());
        th_2.interrupt();
        //每个对象都是通过一个标志位来获取当前线程对象的标志位：
        // True是表示清除了标志位，当前线程已经中断，false表示没有清除标志位，当前线程没有中断
        System.out.println(th_2.getState());
        System.out.println(th_2.isInterrupted());

    }
}
