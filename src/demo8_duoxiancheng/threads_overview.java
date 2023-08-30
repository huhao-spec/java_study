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
    * */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<100;i++){
                    System.out.println("--------胡淏炒菜------");
                }
            }
        }).start();

        for (int i =0; i<100;i++){
        System.out.println("张角炒菜");
        }
//        myTest myTest = new myTest();
//        myTest.myTest();
    }
}
