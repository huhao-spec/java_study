package demo11_shengchanxiaofei;

public class Hanberger {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "hanberger{" +
                "id=" + id +
                '}';
    }

    public Hanberger(int id) {
        this.id = id;
    }
}
