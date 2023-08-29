package demo3_duotai;

public class test_objecy {
    public static void main(String[] args) {
        object_class_chnagyong object_1 = new object_class_chnagyong(1,"胡淏",99);
        object_class_chnagyong object_2 = new object_class_chnagyong(1,"胡淏",99);
        user_1 user_1 = new user_1("胡淏",2);
        System.out.println(object_1);// 如果我们相知道object_1里的信息，我们可以对tostring()进行重写
        System.out.println(object_1.equals(object_2));
        System.out.println(object_1.hashCode());
        System.out.println(object_2.hashCode());
        System.out.println(user_1.hashCode());
    }
}
