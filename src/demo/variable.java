package demo;

import java.util.Scanner;

public class variable {
    public static void main(String[] args){
//          描述一个人的信息
//        double weight = 175.5d;
//        String name = "胡淏";//String用双引号
//        long id = 61252620000501l;
//        char gender = '男';// char类型用单引号
//        float high = 121.12f;
//          System.out.println(weight+name+gender+id+high);


        // 数据类型转换
        // 自动转换数据类型:只能低字节向高字节转换，针对于数值类型的
        // 转换的方向
        // byte>short>int>long>float>double
        int shuju=10;
        double num2 = shuju;
        System.out.println(num2);

        // 强制转换
        float Num3 = 10.3f;
        int num4 = (int)Num3;
        System.out.println(num4);

        // 输入文本
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
    }
}
