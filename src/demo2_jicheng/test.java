package demo2_jicheng;

public class test {
    public static void main(String[] args) {
        user user = new user(121);
        //这句先调用了父类的程序，再进行了子类程序先有爹再有儿子。
        //无论怎么杨一定是通过无参创建父类
        // 方法重写跟方法重载
        // 位置，方法重写在子类中对父类的方法进行重写，方法重载就是在同一个类中实现的不同的方法
        //方法名：方法重写相同，方法重载相同。
        // 参数列表；方法重写相同，方法重载不同。
        // 返回值：方法重写相同就是其子类，重载没有要求
        // 访问权限：方法重写不能小于父类，重载没有要求
        user.show(12);
        people people = new people();
        people.show();
        people.show(1);

    }
}
