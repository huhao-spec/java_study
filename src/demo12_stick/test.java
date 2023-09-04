package demo12_stick;

public class test {
    public static void main(String[] args) {
        tick tick = new tick();
        new Thread(tick::sold,"A").start();
        new Thread(tick::sold,"B").start();
        new Thread(tick::sold,"C").start();
    }
}
