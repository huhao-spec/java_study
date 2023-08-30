package demo8_duoxiancheng;

public class thread_state extends Thread {
    /*
    * 线程的5中状态可以不断的切换，在test.java中举例说明
    * 1.创建状态：实例化一个新的线程对象，还没启动。
    * 2.就绪状态：创建好的线程对象调用start方法，完成启动进入线程池，等待抢占cpu资源
    * 3.运行状态：资源抢到了，获取cpu资源在一定的时间执行任务
    * 4.阻塞状态：正在执行的时候暂停执行任务，把占用的资源释放出来，在解除阻塞状态后不会继续进行，回到2状态再继续进行
    * 5.终止状态：线程运行完毕，或者异常导致线程终止运行
    *
    *
    * 线程调度：
    * 线程休眠：就是让当前线程暂停执行，从运行状态进入到阻塞状态，将CPU资源让给其他线程的调度方式，通过.sleep(long 毫秒)实现
    * 调用时需要传入毫秒这个参数
    * 方式1，在继承thread里直接调用sleep()
    * 方式2，在mian函数里去try抛出异常再休眠用          线程名.sleep(5000)调用
    * 还有这种方式每执行一遍函数，让线程休眠一会
    * sleep是静态本地方法可以通过类调用，也可以通过对象调用，方法定义抛出InterruptionException，
    * 继承自Exception外部调用时候必须手动处理异常，一般我们使用的时候都是采用try{}catch(){}方式去用
    *
    *
    * 线程合并：
    * 合并是将指定的某个线程加入到当前线程中，合并为一个线程，由亮哥哥线程交替执行变成一个线程中的两个子线程顺序执行
    * 通过调用join来实现合并
    * 线程1执行到某个时间点，时候调用线程2的join方法，则表示从当前时间点开始，cpu的资源被2独占，1进入阻塞状态，直到2执行完毕
    * 1进入就绪状态，等cpu资源进入运行状态*/

    @Override
    public void run() {
        for(int i =0;i<10;i++){
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+"线程休眠方式");

        }
    }
}
