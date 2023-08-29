package demo;

public class student {
     int id;
    String name;

    public student(){
        this("张三",66);
        System.out.println("无参构造方法调用成功");
        //只能在构造方法里用this才能调用构造方法,并且前面不能有其他语句
    }
    public student(String str,int idnum){
        id = idnum;//这个id加一个this就指向了我们当前包下的变量
        this.name = str;
        System.out.println("有参构造方法调用成功");
        System.out.println(id+name);
    }
    public void show(){
        System.out.println(id);
        System.out.println(name);
    }

}
