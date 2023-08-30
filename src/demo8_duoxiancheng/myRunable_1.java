package demo8_duoxiancheng;

public class myRunable_1 implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("Runable-------------------");
        }
    }
}
