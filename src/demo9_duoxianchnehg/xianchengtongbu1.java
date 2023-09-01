package demo9_duoxianchnehg;

public class xianchengtongbu1 {
    public static int num;
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            Thread th1 = new Thread(new Runnable() {
                @Override
                public  void run() {
                    xianchengtongbu1.test();
                }
            });
            th1.start();
        }

    }

    // 当两个并发线程(thread1和thread2)访问同一个对象（这个很重要）(ThreadSyn)中的synchronized代码块时，
    // 在同一时刻只能有一个线程得到执行，另一个线程受阻塞，必须等待当前线程执行完这个代码块以后才能执行该代码块。
    // Thread1和thread2是互斥的，
    // 因为在执行synchronized代码块时会锁定当前的对象，只有执行完该代码块才能释放该对象锁，
    // 下一个线程才能执行并锁定该对象，一个对象就一个锁。
    public synchronized static void test(){
        System.out.println("start----------------");
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("----------------end-");
        System.out.println(num);
        num++;
    }
}
