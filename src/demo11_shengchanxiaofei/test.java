package demo11_shengchanxiaofei;

public class test {
    public static void main(String[] args) {
        rongqi rongqi = new rongqi();
        consumer consumer = new consumer(rongqi);
        producter producter = new producter(rongqi);
        new Thread(producter::product).start();
        new Thread(consumer::consume).start();
        new Thread(consumer::consume).start();
    }
}
