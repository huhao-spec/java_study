package demo;

public class classandobject {
    public static void main(String[] args) {
        /* 面向对象
         * 类和对象
         * 类和对象都有自己的特征：属性，方法
         * 属性指的是对象的静态特征，方法是用来描述对象的动态特征
         * 对象是描述一个客观存在的实体
         * 类是产生对象的模板template，all object is created of template.
         * the relationship of template and object：
         * 类是对象的抽象化描述，这些对象都有相同的特征与动作
         * 对象是类的具体实例。
         * java程序是以类为组织单元，主体是通过类来创建的具体对象
         * 怎么定义类
         * public class 类名{
         *  // 定义属性，属性名符合驼峰式命名法
         *  public 数据类型 数据名；
         *  //定义方法，方法名符合驼峰式命名法
         *  public 返回值类型  方法名（参数列表：数据类型 参数名）{
         *          方法体
         *          }
         * }
         * java关于返回值的定义分为两类：有与没有返回值的方法，返回值的类型与开始定义的方法有关
         * 用return返回
         * 栈里面存类，堆里面存对象
         * */
        addNum(1,2);
        System.out.println(addNum(2,4));

    }
    public static int addNum(int num1,int num2){
        System.out.println();
        int num3;
        num3 = num1+num2;
        System.out.println(num3);
        return num3;
    }
}
