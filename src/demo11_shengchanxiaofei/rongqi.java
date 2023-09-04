package demo11_shengchanxiaofei;

import java.util.concurrent.locks.ReentrantLock;

public class rongqi {
    public Hanberger[] array = new Hanberger[6];
    public int index = 0;
    public void num() {
        int j = 0;
        for (int i = 0; i < 6; i++) {
            if (array[i]!=null){
            j++;
            }
        }
        System.out.println(j);
    }
    // 向容器中添加汉堡
    public synchronized void push(Hanberger hanberger){
        while (index >= array.length){

            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        this.notify();
        array[index] = hanberger;
        index++;
        System.out.println("生产了一个汉堡"+hanberger);
        num();

    }
    public synchronized Hanberger pop() {
        while (index <= 0) {
            try {
                this.wait();// 这个语句是让当前访问该资源的线程暂停
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.notify();// 让正在访问当前资源的并且正在阻塞的线程唤醒
        index--;
        System.out.println("出去了一个汉堡" + array[index]);
        num();
        return array[index];

    }
}
