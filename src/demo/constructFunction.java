package demo;

public class constructFunction {
    public constructFunction(){
        // 这就是构造方法
        // 构造函数自动调用
        System.out.println(1212);
    }
    public static void main(String[] args){
        /* 构造函数、构造方法、构造器
        主函数main是程序的入口
         * 构造函数是一种特殊的方法，普通的方法是来描述某个动作的，构造方法是用来创建对象的
         * 1.方法名必须与类名一致
         * 2.不需要定义返回值与返回类型
         构造函数可分为有参构造与无参构造
         每一个类都有一个默认的构造函数，直接输出其默认的值
         自带一个默认的无参构造函数，如果在类中手动定义一个有参构造，则会覆盖默认的无参构造
         this关键字:
         this用来指代当前类的实例化对象,通过this可以调用当前类的属性与方法
         比如在有参构造中,可以将外部传入的值付给当前的方法中的参数里去,比如说student.java文件中的this用法
         除了在类中访问属性也可以调用方法,类中方法分为两类:构造方法与普通方法
         用this调用两类都不同,调用构造函数例子在student中
         调用普通方法在是:this.方法名(参数列表);可以在构造函数中使用也能在普通方法中使用

         */
        student student = new student();
        student.show();
        student.name = "成宇超";
        student.id = 1;
        student.show();
        student student1 = new student("胡淏",612526);
        student1.show();
        student_static.name = "胡淏";
        student_static.show();

    }
    public static int addNum(int num1,int num2){
        // 普通方法
        return num1+num2;
    }
}
