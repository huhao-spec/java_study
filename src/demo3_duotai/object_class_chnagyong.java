package demo3_duotai;

public class object_class_chnagyong {
    private Integer id;
    private String name;
    private double score;

    @Override
    public String toString() {
        return "people[id="+id+",name="+name+",score = "+score+"]";
    }

    @Override
    public boolean equals(Object obj) {
        object_class_chnagyong object_num =  (object_class_chnagyong)obj;// 这一句是把我们输入进来的对象实例化
        if(this.id!=object_num.id&&this.name.equals(object_num.name)&&this.score!=object_num.score){//this是指前面.equals的调用方，而object_num是被我们实例化的obj
            System.out.println(this.id);
            System.out.println(object_num.id);
            return true;
        }else {return false;}
    }

    @Override
    public int hashCode() {
        System.out.println("调用了重写的方法");
        return (int) (name.hashCode()*id*score);
    }

    public object_class_chnagyong(Integer id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void test() throws CloneNotSupportedException, InterruptedException {
        hashCode();
        getClass();
        clone();//复制一个对象
        toString();// 经常重写，以字符串的形式传回对象的实例化信息
        notify();// 线程的唤醒
        notifyAll();//唤醒休眠的线程
        wait();// 线程休眠
        wait(10000);

    }
}
