package demo10_suo;

public class deadLock_test {
    public static void main(String[] args) {
        Runnable deadlock = new deadlock();
        ((demo10_suo.deadlock) deadlock).num = 1;
        Runnable deadlock1 = new deadlock();
        ((demo10_suo.deadlock) deadlock1).num  = 2;
        Thread th1 = new Thread(deadlock,"线程1");
        Thread th2 = new Thread(deadlock1,"线程2");
        th1.start();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th2.start();
    }
}
