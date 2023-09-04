package demo13_bingfa;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test {
    public static void main(String[] args) {
        Callable1 Callable1 = new Callable1();
        FutureTask Fu = new FutureTask(Callable1);
        Thread Thread = new Thread(Fu);
        Thread.start();

        try {
            String value = (String) Fu.get();
            System.out.println(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        // 直接通过new Thread去调用Callable1.call是不行的，
        // 可以通过FutureTask去实现Runnable然后在线程里面实现Callable，可以理解Callable是FutureTask的一个参数
    }
}
class Callable1 implements Callable<String>{

    /**
     * @return
     * @throws Exception
     */
    @Override
    public String call() throws Exception {
        System.out.println("callabkle");
        return "hello";
    }
}
