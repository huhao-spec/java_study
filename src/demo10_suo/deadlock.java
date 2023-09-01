package demo10_suo;

public class deadlock implements Runnable{
    /* 线程同步会导致死锁
     * 一个线程完成业务要同时访问两个资源
     * 死锁：多个线程在完成业务，出现争抢资源的情况*/
    public int num;
    private static kuaizi kuaizi1 =new kuaizi();
    private static kuaizi kuaizi2 =new kuaizi();
    @Override
    public void run() {
        if(num == 1){
            System.out.println(Thread.currentThread().getName()+"拿到了筷子1，等着筷子2");
            synchronized (kuaizi1){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized(kuaizi2){
                    System.out.println(Thread.currentThread().getName()+"拿到了筷子1，拿到了筷子2");
                }
            }
        }
        if(num == 2){
            System.out.println(Thread.currentThread().getName()+"拿到了筷子2，等着筷子1");
            synchronized (kuaizi2){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized(kuaizi1){
                    System.out.println(Thread.currentThread().getName()+"拿到了筷子2，拿到了筷子1");
                }
            }
        }
    }


}
