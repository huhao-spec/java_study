package demo3_duotai;

import java.util.ArrayList;
import java.util.List;

public class demo_baozhuanglei {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();// 创建了一个list对象里面放的都是String的
        // 什么是包装类
        list.add("成宇超");
        list.add("是我");
        list.add("儿");
        System.out.println(list);
        List<Integer> list_num = new ArrayList<>(123);// Integer是int的包装类；
        list_num.add(123);
        list_num.add(456);
        list_num.add(789);
        System.out.println(list_num);
        byte b = 1;
        Byte byt  = new Byte(b);// finial 修饰的变量不能被继承了
        // 转换类型：
        int i = Integer.parseInt("1");//将字符串类型转换成基本类型
        System.out.println(i);
//        float num_1 = (double) Double.parseDouble("151");



    }

}
