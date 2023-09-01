package demo10_suo;

public class diouhe {
    public static void main(String[] args) {
        acount2 acount = new acount2();
        new Thread(acount::count).start();
        new Thread(acount::count).start();
    }
}
class acount2{
    public static int num=0;
    public synchronized void count(){
        num++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"\t\t"+"是第"+num+"位访客");
    }
}