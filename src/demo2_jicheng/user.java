package demo2_jicheng;

public class user extends people {
    // 创建子类对象得时候会默认创建一个父类对象，无论是通过有无参构造来创建子类对象，都是通过无参构造来创建父类对象
    private double scores;
//    static {
//        System.out.println("子类的静态代码块开始执行");
//    }
    public double getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public user() {
        System.out.println("通过无参构造创建了User对象");
    }
    public user(double score){
        super((int)score);
//        super.show((int)score);
        //可以通过super关键字让子类创建对象时调用父类的有参构造
        // 把数据传进去,就可以调用了有参，通过构造方法可以不通过set去修改，但是赋值后是不能修改的
        // 子类可以访问父类的构造方法，方法，成员变量，都是通过super关键字去完成的
        // ex：super(参数列表)
        // ex: super.方法名(参数列表)
        // ex：super。成员变量名=
        // 调用子类的对象的时候，会默认调用父类的无参构造方法
//        System.out.println("有参构造构造成功");
//        System.out.println("调用父类的输出无参函数");

    }
    public void show(int id){
        // 通过super来调用父类的方法
        // 在子类的普通方法里可以使用父类的普通方法，但在子类的构造函数中可以调用父类的构造函数
        // 子类也有访问权限的
        // 访问权限修饰符
        // 对父类的方法重写要保证3个条件，1，父子类的方法名相同，2，父子类的方法参数列表相同3，父子类返回值类型相同或者是其子类。
        // 4 子类的访问权限不能小于父类
//        super.setName("张三");
//        System.out.println(super.getName());
        System.out.println("编号是"+id);
    }
}
