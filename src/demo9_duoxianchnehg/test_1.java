package demo9_duoxianchnehg;

public class test_1 {
    // 双线程同步运行的话可能存在
    public static void main(String[] args) {
        Thread th0 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemon.getSingletonDemon();
            }
        });
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonDemon.getSingletonDemon();
            }
        });
        th1.start();
        th0.start();


    }
}
