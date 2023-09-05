package demo14_jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
// 这里存在一个读写并发异常的问题
// Vector 使用了 Synchronized 来实现线程同步，是线程安全的，而 ArrayList 是非线程安全的。
// Vector的add方法自带Synchronized
public class demo14_jihe {
    public static void main(String[] args) {
        List<String> list= new Vector<>();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // 写
                list.add("a");
                // 读
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
