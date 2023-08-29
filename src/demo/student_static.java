package demo;

public class student_static {
    public static int id;
    public static String name;

    public student_static(){
        // this("张三",66);
        System.out.println("无参构造方法调用成功");
        //只能在构造方法里用this才能调用构造方法,并且前面不能有其他语句
    }
    public student_static(String str,int idnum){
        id = idnum;//这个id加一个this就指向了我们当前包下的变量
        name = str;
        System.out.println("有参构造方法调用成功");
        System.out.println(id+name);
    }
    public static void show(){
//        student_static student_static = new student_static();
        System.out.println(id);
        System.out.println(name);
    }
    public void run(){
        System.out.println("学生跑步");
    }

}
