package demo9_duoxianchnehg;

public class xianchengtongbu {
    /*java允许多线程并行访问，同一时间段各自完成各自的操作
    * 线程同步操作的数据的时候，可能存在数据不准确的问题
    * 怎么实现线程同步在run方法里加一个synchronized用来线程同步
    * 每一个java对象都有一个内置锁，内置锁会保护使用的synchronized修饰的方法，要调用这个方法必须先获得锁，才能进行*/
    public static void main(String[] args) {
        Runnable run0 = new fangke_conme();
        Thread th1 = new Thread(run0,"线程1");
        Thread th0 = new Thread(run0,"线程0");
        th0.start();
        th1.start();
    }
}
