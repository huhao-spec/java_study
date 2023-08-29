package demo4_jiekou;

public interface demo_1 {
    // 接口就是将业务进行分离，以接口形式去对接不同的业务模块
    // 接口在java中是独立存在的，和类相似，要new一个接口文件，用class关键字连标识类
    // 用interface来标识接口
    // 接口实际上是一个抽象类，极度抽象的抽象类，
    // 一个类中，一旦没有具体的实现方法时，那么该类必须是抽象类，同时抽象类中  允许存在非抽象算法，
    // 接口不一样，接口中不能存在非抽象方法，接口中必须全部都是抽象方法。
    // 接口中允许定义成员变量，不能定义private定义的成员变量，
    // 接口中的成员变量必须在定义得时候就完成初始化。
    //
    public int id = 1;
    public String name = "胡淏";
    int age  = 23;
    public void test_jiekou(int i);

}
