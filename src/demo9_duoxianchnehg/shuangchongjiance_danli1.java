package demo9_duoxianchnehg;

public class shuangchongjiance_danli1 {
    private volatile static shuangchongjiance_danli1 shuangchongjiance_danli1;
    // volatile 关键字修饰的作用可以让线程可见数据的修改，仅一个synchronized是不能让主内存里面的数据对线程可见的，而加一个volatile可以
    // synchronized关键字是实现线程同步，让在访问同一个资源的多线程排队去完成业务，避免出现数据错乱的情况
     private shuangchongjiance_danli1(){
         System.out.println("单例程序");
     }
     public static shuangchongjiance_danli1 getInstance(Integer i) {
         if (shuangchongjiance_danli1==null){
             synchronized (i) {// 上锁的东西一定得是一个实例，有东西才能上锁
                 //  也不能锁基本类型，可以锁包装类
                 if (shuangchongjiance_danli1 == null) {
                     shuangchongjiance_danli1 = new shuangchongjiance_danli1();
                 }
             }
        }
         return shuangchongjiance_danli1;
     }
}
