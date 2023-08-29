package demo7_lianxi;

public class midCar extends car implements lanned  {
    private int getWeight;
    public midCar(String name, String color,int weight) {
        super(name, color);
        this.getWeight = weight;
    }

    @Override
    public String seatNum() {
        return "2座";
    }

    @Override
    public int getWeight() {
        return this.getWeight;
    }
}
