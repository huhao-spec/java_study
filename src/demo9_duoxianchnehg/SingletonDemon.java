package demo9_duoxianchnehg;

public class SingletonDemon {
    // 单例模式是一种常见的软件设计模式，核心思想是一个类只有一个实例对象
    private static SingletonDemon SingletonDemon;//创建一个静态的SingletonDemon
    private SingletonDemon(){//定义成私有的就不能想new就new了
        System.out.println("创建了SingletonDemon");
    }
    public synchronized static SingletonDemon getSingletonDemon(){
        if(SingletonDemon ==null){
            SingletonDemon = new SingletonDemon();
        }
        return SingletonDemon;
    }
}
