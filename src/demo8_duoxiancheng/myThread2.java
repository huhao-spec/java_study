package demo8_duoxiancheng;

public class myThread2 extends Thread{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            if(i == 20){
                yield();
            }
            System.out.println(myThread2.currentThread().getName()+"---------"+i);
        }
    }
}
