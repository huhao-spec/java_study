package demo5_jiekou_2;

public class test {
    public static void main(String[] args) {
        factory fac = new factory();
        equipment eq_a = new equipment_a();
        equipment eq_b = new equipment_b();
        fac.setEquipment(eq_b);
        fac.work();
    }
}
