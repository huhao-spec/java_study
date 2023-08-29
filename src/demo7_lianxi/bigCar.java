package demo7_lianxi;

public class bigCar extends car{

    public bigCar(String name, String color) {
        super(name, color);
    }

    @Override
    public String seatNum() {
        return "53座";
    }
}
