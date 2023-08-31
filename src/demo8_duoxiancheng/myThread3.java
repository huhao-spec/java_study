package demo8_duoxiancheng;

public class myThread3 extends Thread{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println(myThread2.currentThread().getName()+"---------"+i);
        }
    }
}
