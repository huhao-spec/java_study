package demo;

import java.util.Arrays;
import java.util.Scanner;

public class easyBUS {
    // 定义到main方法外面扩大作用域 得吧成员变量与方法是统一静态或者没有的情况
    static String[] names = {"胡淏","里斯","张三","王八"};
    static int[] ages = {23,53,21,18};
    static String[] sex = {"男","女","女","女"};
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("用户管理系统");
            System.out.println("1 inquiry");
            System.out.println("2 delete");
            System.out.println("3 arise");
            System.out.println("4 freeze");
            System.out.println("5 unfreeze");
            System.out.println("6 exit");
            System.out.println("input?");
            num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println("inquiry user");
                    System.out.println("names\t\tages\t\tsex");
                    for(int i=0; i<names.length;i++){
                        System.out.println(names[i]+"\t\t"+ages[i]+"\t\t"+sex[i]);
                    }
                    System.out.println("0=return last window");
                    System.out.println("please input");
                    num = scanner.nextInt();
                    while(num!=0) {
                        System.out.println("please re-input ");
                        num = scanner.nextInt();
                    }
                break;
                case 2:
                    System.out.println("delete user");
                    System.out.println("what number of user are operated");
                    num = scanner.nextInt();
                    if(num>4){
                        System.out.println("error");
                    }else{
                        names[num] = null;
                        ages[num] = 0;
                        sex[num] = null;
                    };
                break;
                case 3:
                    System.out.println("registered user");
                    if(names[names.length-1]==null){
                        System.out.println("Please enter the name of the user you want to add");
                        String name = scanner.next();
                        boolean flag = nameIsExist(name);
                        if(flag){
                            System.out.println("this name is repeat");
                            System.out.println("erro,Please enter the name of the user you want to add?");
                        }else {
                            // names= Arrays.copyOf(names,names.length+1);// 直接把旧表复制到新表并且扩充长度
                            names[names.length-1]= name;
                            System.out.println("The addition succeeded");
                        }
                    }else {
                        System.out.println("this array is overflow");
                    }



                break;
                case 4:
                    System.out.println("freeze user");
                break;
                case 5:
                    System.out.println("unfreeze user");
                break;
                case 6:
                    System.out.println("exit system");
                break;

            }
        }while (num<6);
    }
    public static boolean nameIsExist(String name){
        for(int i=0;i<names.length;i++){
            // null不能调用equals
            if((name.equals(names[i]))){
                return true;
            }
        }
        return false;
    }
}
