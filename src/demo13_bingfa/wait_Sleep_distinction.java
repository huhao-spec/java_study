package demo13_bingfa;


import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class wait_Sleep_distinction {
    public static void main(String[] args) {
        Account1 Account = new Account1();

        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                Account.arise();
            }
        },"制作者1").start();
        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                int num = Account.getNum1();
                if (num>0) {
                    Account.decline();
                }else{

                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Account.decline();
                }
            }
        },"制作者2").start();
//        new Thread(Account::decline,"消费者1").start();
//        new Thread(Account::decline,"消费者2").start();

    }
}
class Account1 {
    public int getNum1() {
        return num1;
    }

    private int num1;
    private ReentrantLock lock = new ReentrantLock();


    public void arise() {
        lock.lock();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        num1++;
        System.out.println(Thread.currentThread().getName() + "做了一个,当前剩余" + num1);
        lock.unlock();
    }

    public void decline() {
        lock.lock();
        num1--;
        System.out.println(Thread.currentThread().getName() + "消费了一个，当前剩余" + num1);
        lock.unlock();
    }
}


