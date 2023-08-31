package demo9_duoxianchnehg;

public class xianchengtongbu {
    /*java允许多线程并行访问，同一时间段各自完成各自的操作
    * 线程同步操作的数据的时候，可能存在数据不准确的问题*/
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            Runnable run0 = new fangke_conme();
            Thread th0 = new Thread(run0,"线程"+i);
            th0.start();
        }
    }
}
