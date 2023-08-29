package demo;

import demo2_jicheng.user;

public class Test {
    /*
    * 成员变量与局部变量
    * 变量的作用域是值在程序中可以通过变量名来访问该变量的范围
    * 变量的作用域在声明的时候就已经决定了
    * java中根据不同作用域可以变量分为成员变量与局部变量
    * 局部变量:如果一个变量在方法中声明就是局部只能在方法内使用
    * 成员变量:在方法外类中
    * 区别:
    * 成员变量作用域在整个类中都能使用,类中的每个方法都能访问这个变量,局部变量的作用域旨在定义该变量定义的方法中,出去了就没办法使用
    * 两者的初始值不一样,局部变量不会赋初始值会出错,而成员变量付不付都行自己附带默认值
    * 封装是把属性藏在内部,外部不能直接修改或者访问,通过修改成员变量的属性*/
    public static void main(String[] args){
//        Test test = new Test();
        user user = new user();
        user.setAge(-10);
        user.setName("胡淏");
        user.setId(612526);
        System.out.println(user.getAge());
        System.out.println(user.getName());
//        test.Show();
//        test.Show1();
    }
    int num1 = 300;
    public void Show(){
        int num = 60;
        System.out.println(num);//局部变量比成员变量优先级高
        System.out.println(this.num1);//加一个this就变成成员变量
    }
    public void Show1(){
        System.out.println(num1);
    }
}
