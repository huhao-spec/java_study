package demo8_duoxiancheng;

public class test_merge {
    public static void main(String[] args) throws InterruptedException {
        myRunnable_3 run_1 = new myRunnable_3();
        Thread Thread_1 = new Thread(run_1);
        Thread_1.start();
        for(int i = 0;i<100;i++){
            System.out.println(i+"主线程开始运行");
            if(i==30){// 当主线程中i =10 调用Thread.join();然后Thread_1强行合并，cpu被占了
                try{
                    Thread_1.join(10000);// 子线程占10秒后释放资源
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
