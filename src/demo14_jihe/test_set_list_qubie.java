package demo14_jihe;


import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

public class test_set_list_qubie {

    public static void main(String[] args) {
        // 声明的CopyOnWriteArrayList不是简单的添加元素，是直接复制当前容器，向新的容器里面添加数据
        // 添加完成后，再将原容器的的引用指向新的容器
        // 这样就避免了两个线程同时修改一个和容器，避免了线程的读写错误
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(()->{
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                set.add(finalI+"a");
                System.out.println(set);
            },String.valueOf(i)).start();


        }
    }
}
