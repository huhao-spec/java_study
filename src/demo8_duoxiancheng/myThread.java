package demo8_duoxiancheng;

public class myThread extends Thread{
    /*
    * JRE:Java Runtime Enviroment(java运行环境)，仅供运行程序
    * JDK:Java development Kit(java开发工具)，程序开发用这个*/

    @Override
    public void run() {
//        super.run();这个是父类中的运行，想要实现我们的自己的功能就在下面重新写
        for (int i =0;i<10;i++){
            if(i == 5){
                try{
                    sleep(2000);
                }catch(InterruptedException ee ){
                    ee.printStackTrace();
                }
            }
            System.out.println("线程1开始运行");
        }
    }
}
