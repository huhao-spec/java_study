package demo7_lianxi;

import java.util.Scanner;

public class test {
    private static Scanner scanner;
    private static littleCar littleCar;
    private static midCar midCar;
    private static bigCar bigCar;
    private static car[] cars;
    static {
        scanner=new Scanner(System.in);
        littleCar = new littleCar("小轿车","白色");
        midCar = new midCar("货车","蓝色",12);
        bigCar = new bigCar("大巴车","绿色");
        cars = new car[3];
        cars[0]=littleCar;
        cars[1]=midCar;
        cars[2]=bigCar;
    }
    public void showCars() throws Error_weight {
        System.out.println("欢迎使用");
        System.out.println("车辆名称\t\t车辆颜色\t\t座位数\t\t载重量");
        for (car car:cars){
            if(car instanceof midCar){
                midCar midCar = (midCar)car;
                // 这里必须强行转成midcar才能调用midCar得方法，不然调用不了
                System.out.println(car.getName()+"\t\t"+car.getColor()+"\t\t"+car.seatNum()+"\t\t"+midCar.getWeight());
            }else{
                System.out.println(car.getName()+"\t\t"+car.getColor()+"\t\t"+car.seatNum()+"\t\t不能拉货");
            }
        }
        System.out.println("1.轿车2.货车3.大巴车");
        System.out.println("输入编号");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                update("littleCar");
                break;
            case 2:
                update("midCar");
                break;
            case 3:
                update("car");
                break;
            default:
                System.out.println("输入错误，车辆不存在");
                break;
        }
    }
    public void update(String type) throws Error_weight{
        String name=null;
        String color = null;
        int weight;
        if(type.equals("littleCar")){
            System.out.println("请输入小轿车名字");
            name = scanner.next();
            System.out.println("请输入小轿车颜色");
            color = scanner.next();
            car littleNewCar = new littleCar(name,color);
            cars[0] = littleNewCar;
        }
        if(type.equals("midCar")){
            System.out.println("请输入货车名字");
            name = scanner.next();
            System.out.println("请输入货车颜色");
            color = scanner.next();
            System.out.println("请输入货车载重量");
            weight = scanner.nextInt();
            if(weight>12)
            {
                try{
                    throw new Error_weight("载多了");
                }catch (Exception e){
                    e.printStackTrace();
                    return;
                }
            }
            else{
                car midCar1 = new midCar(name,color,weight);
                cars[1] = midCar1;
            }

        }
        if(type.equals("bigCar")){
            System.out.println("请输入大巴名字");
            name = scanner.next();
            System.out.println("请输入大巴颜色");
            color = scanner.next();
            car bigCar = new bigCar(name,color);
            cars[2] = bigCar;
        }
        showCars();
    }

    public static void main(String[] args) throws Error_weight {
        test test = new test();
        test.showCars();
    }
}
