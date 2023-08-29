package demo7_lianxi;

public class littleCar extends car {

    public littleCar(String name, String color) {
        super(name, color);
    }

    @Override
    public String seatNum() {
        return "4座";
    }

}
