package demo8_duoxiancheng;

public class myRunnable_2 implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("++++++++++Runnale");
        }
    }
}
