package demo6_exception;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class test {
    public static void main(String[] args) throws myNumException{
        int[] array = {1,2,3};
        System.out.println(array[2]);
        // 可以通过try\catch\finally对抛出得异常进行处理
        // Error和Exception都是错误类型
        // Error是系统错误程序无法处理、
        // exception是程序运行得错误，程序可以处理。
        // exception常见的子类：IOException&&RuntimeException
        // IOException常见有：FileLockinterruptException、FileNotFoundException
        // 通常都是通过IO流进行传输文件得错误
        // ArithmeticException:表示数学运算异常
        // ClassNotFoundException：表类未定义异常
        // illelArgumentException：表参数格式错无
        // ArrayIndexOutOFBounds:表示数组下表越界
        // NullPountException:表示空指针异常
        // NosuchMethodError：表示方法未定义异常
        // NumberFormatException:表数据转换异常
//         try {
//             Class clazz = Class.forName("test.student");//找test.student这个类
//         }catch (Exception e){
//             e.printStackTrace();
//         }
        test test =new test();
        System.out.println(test.add(2.2));
        }
    public int add(Object obj) throws myNumException {
        if (obj instanceof Integer) {
            int num = (int) obj;
            return num++;
        }else{}
        String error = "传入参数有误";
        myNumException error_1 = new myNumException(error);
        throw error_1;
    }
}
