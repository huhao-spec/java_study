package demo3_duotai;

public abstract class key_Abstract_words {
    // 加一个关键字Abstract就可以变成没有方法体的方法，变成抽象类
    // 一个类中定义了抽象方法，则该类也要声明为抽象类，则要在类上也声明为抽象类
    // 区别：1.抽象类不能被实例化，就是不能new了
    // 抽象类里可以没有抽象方法，但是包含了抽象方法的类，必须是抽象类
    // 抽象类里定义的抽象方法，一旦继承，在子类中必须实现
    // 如果子类也是抽象方法，则不用实现父类方法
    public abstract void buyBook();
}
