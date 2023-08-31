package demo8_duoxiancheng;

public class myTest_lirang {
    public static void main(String[] args) {
        Thread th_1 = new myThread2();
        th_1.setName("胡淏新建的线程");
        th_1.start();
        Thread th_2 = new myThread3();
        th_2.setName("胡淏新建的线程2");
        th_2.start();
    }
}
