package demo2_jicheng;

public class people {
    private int id = 3;
    private String name;
    private String sex;
    private int age;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    static {
//        System.out.println("父类的静态代码块开始执行");
//    }
    public people(){
        super();//这个写不写都会调用这个父类的属性
        System.out.println("编号是"+id);
    }
    public void show(int id){
        System.out.println("编号是"+id);
    }
    public people(int id) {
        this.id = id;
        System.out.println("父类的id"+id);
        System.out.println("有参构造成功");
    }
    public void show(){
        System.out.println("无参方法重载");
    }

}
