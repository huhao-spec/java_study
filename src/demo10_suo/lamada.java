package demo10_suo;

import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;

public class lamada {
    public static void main(String[] args) {
        // 简介的lamada表达式
        // 大括号可以去掉，只能存在于大括号里面只存在一行代码的时候
        new Thread(()->{for(int i =0;i<10;i++) System.out.println("lamada");}).start();
        new Thread(()->{for(int i =0;i<10;i++) System.out.println("lamada2");}).start();
        new Thread(()->{for(int i =0;i<10;i++) System.out.println("lamada3");}).start();
        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("shuchu");
            }
        }).start();
    }
}
