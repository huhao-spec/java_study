package demo8_duoxiancheng;

public class threads_overview {
    /*多线程的优点
    1.系统资源利用更加合理
    2.程序设计更加简洁
    3.程序响应更快
    缺点；
    1.需要更多的内存空间支持多线程
    2.线程并发访问的情况可能会影响数据的准确性
    3.数据被多线程共享，可能会出现死锁的情况
    * java 线程中使用方式
    1.继承Thread类
    1.1 创建定义类并继承Thread类
    1.2 重写Thread类中的run方法，并编写该线程的业务逻辑代码
    2.实现Runnable接口
    2.1 创建自定义类，并实现Runable接口
    2.2 实现run方法，编写该线程业务逻辑代码
    */
    public static void main(String[] args) {
        // Thread就是线程
        // 而Runnable是任务
        new Thread(new Runnable() {
            // 线程1
            @Override
            public void run() {
                for (int i = 0;i<100;i++){
                    System.out.println("--------胡淏炒菜------");
                }
            }
        }).start();

        new Thread(new Runnable() {
            // 线程2
            @Override
            public void run() {
                for (int i =0; i<100;i++){
                    System.out.println("---王五炒菜");
                }
            }
        }).start();


        for (int i =0; i<100;i++){
        System.out.println("-----张角炒菜");
        }
//        myTest myTest = new myTest();
//        myTest.myTest();
    }
}
