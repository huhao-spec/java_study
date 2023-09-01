package demo9_duoxianchnehg;

public class test {
    public static void main(String[] args) {
        // 这样传进去一个Integer如果两个存储的东西是一样的，在堆内存里是指向同一个东西的
        Thread th0 = new Thread(new Runnable() {
            @Override
            public void run() {
                Integer i = Integer.parseInt("1");
                shuangchongjiance_danli1.getInstance(i);
            }
        });
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Integer i = Integer.parseInt("1");
                shuangchongjiance_danli1.getInstance(i);
            }
        });
        th0.start();
        th1.start();
        //  线程同步是为了实现线程安全，如果只创建一个对象，那么线程就是安全的
        //  如果synchronized修饰的是多个线程共享的数据（同一个数据），那么线程就是安全的
        //

    }
}
