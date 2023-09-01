package demo9_duoxianchnehg;

public class fangke_conme implements Runnable{
    private static int num;
    // 不加静态的话他会一直是从开始调用的一次来运行的,每一个new的fangke都有一个int-num；每次都是新调用的
    @Override
    public synchronized void run() {
        try {
            Thread.currentThread().sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        num++;
        System.out.println(Thread.currentThread().getName()+"是当前第"+num+"访客");
    }
}
