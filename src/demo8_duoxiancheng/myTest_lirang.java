package demo8_duoxiancheng;

public class myTest_lirang {
    public static void main(String[] args) {
        Thread th_1 = new myThread2();
        System.out.println(th_1.getState());//这个语句是获取当前的状态
        System.out.println(th_1.isInterrupted());//这个语句是获取当前的状态
        th_1.setName("胡淏新建的线程");
        th_1.interrupt();
        System.out.println(th_1.getState());//这个语句是获取当前的状态
        System.out.println(th_1.isInterrupted());//这个语句是获取当前的状态
//        th_1.start();
        System.out.println(th_1.getState());//这个语句是获取当前的状态
//        Thread th_2 = new myThread3();
//        th_2.setName("胡淏新建的线程2");
//        th_2.start();
    }
}
