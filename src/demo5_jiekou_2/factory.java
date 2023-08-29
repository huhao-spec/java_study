package demo5_jiekou_2;

public class factory {
    private equipment equipment;

    public demo5_jiekou_2.equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(demo5_jiekou_2.equipment equipment) {
        this.equipment = equipment;
        // 定义的时候定义的父类传入得时候穿子类也可以实现，
    }

    public void work(){
        equipment.work();
    }
}
