package demo8_duoxiancheng;

public class myRunnable_3 implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<30;i++){
            System.out.println(i+"子线程占用多少秒的例子");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
