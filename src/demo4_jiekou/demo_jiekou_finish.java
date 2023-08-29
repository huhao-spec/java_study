package demo4_jiekou;

public class demo_jiekou_finish implements demo_1,demo_2{
    @Override
    public void test_jiekou(int i) {
        // 对接口中的方法进行实现
        // 子类对父类的功能进行实现
        // 使用接口时候，不能直接实例化接口对象，而必须实例化去实现类对象，实现类本身就是一个普通的java类
        // 创建一个实现类得代码就是我正在写的这个
        // 通过implements关键字来指定实现类具体实现的接口，在实现类的内部对所有抽象方法进行实现，同时要求访问权限修饰符
        // 返回值类型，方法名与参数列表必须完全一致
        // 接口与继承，但是，接口可以多继承，
        System.out.println("测试接口1");
        System.out.println(i);
    }

    @Override
    public void mark() {
        System.out.println("测试接口2");
    }
}
