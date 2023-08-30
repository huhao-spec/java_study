package demo8_duoxiancheng;

public class test {
    public static void main(String[] args) {
//        Integer score = 90;
//        String name = "胡淏";
//        System.out.println(name+score);
//        myThread2 thread2 = new myThread2();
//        thread2.start();
//        myThread thread1 = new myThread();
//        // 直接调用run方法其实就是开始了一个run的方法，而真正调用还得是.start
//        thread1.start();
        // Runnable的调用方法
        // 线程是抢占资源的，任务是具体执行业务逻辑，线程内部包含一个任务，任务就是去抢占资源，当抢到了任务开始执行（run）
        // 这个时候这个只是实现了一个具体的业务逻辑，我们需要去创建一个线程去强资源
        myRunable_1 Run_1 = new myRunable_1();
        myRunnable_2 Run_2 = new myRunnable_2();
        Thread thread_1 = new Thread(Run_1);
        Thread thread_2 = new Thread(Run_2);
        thread_1.start();
        thread_2.start();



    }
}
