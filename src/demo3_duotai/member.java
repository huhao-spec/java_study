package demo3_duotai;

public abstract class member {
    // 新建一个会员类作为父类，然后通过会员来继承父类的关系，
    // 父类的方法被重写后,父类的方法会被覆盖，而想要调用可以用super.Function()调用
    public abstract void buyBook();
}
