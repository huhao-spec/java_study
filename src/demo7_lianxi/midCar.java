package demo7_lianxi;

public class midCar extends car implements lanned  {
    private int getWeight;
    public midCar(String name, String color,int weight) {
        super(name, color);
        this.getWeight = weight;
        System.out.println("爹着是为了凸显不一样");
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
