package demo6_exception;

public class myNumException extends Exception {
    // 通过继承Exception得功能实现让他能抛出异常
    public myNumException(String error){
        super(error);

    }
}
