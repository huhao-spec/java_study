package demo3_duotai;

public class test {
    public static void main(String[] args) {
        // 新建一个会员类作为父类，然后通过会员来继承父类的关系，
        // 父类的方法被重写后,父类的方法会被覆盖，而想要调用可以用super.Function()调用
        // 多态的使用方式有两种形式
        // 1，定义方法时候形参设为父类，实际调用方法时传入子类类型的参数
        // 可以看见Cashier.java中buyBook(member)方法中定义的时定义的是父类，但是在本文件中我们传入的是pri_member这个子类
        // 2.定义方法时返回值类型为父类，实际调用时返回子类对象
        // 可见Cashier.java文件中的getMember方法

        // 基本原理都是父类引用可以指向子类对象,在子类中对父类方法进行重写
        // 父类对象可以指向子类对象，但是子类不能指向父类exp：15-17行
        member member = new pri_member();
        member = new superMember();
//        pri_member pri_member1 = new member();不能指了怎么办，强制转换，exp18
//        pri_member pri_member1 = (pri_member)new member();

        pri_member pri_member = new pri_member();
        member superMember = new superMember();
        Cashier Cashier = new Cashier();
        Cashier.setMember(superMember);
        Cashier.settlement();
        Cashier.settlement(pri_member);
        // 这个方法其实就是，利用了方法重载的问题
    }
}
