package cn.itcast.code.day19.ExceptionLearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    A:一个异常
B:二个异常的处理
		a:每一个写一个try...catch
		b:写一个try，多个catch
			try{
				...
			}catch(异常类名 变量名) {
				...
			}
			catch(异常类名 变量名) {
				...
			}
			...

			注意事项：
				1:能明确的尽量明确，不要用大的来处理。
				2:平级关系的异常谁前谁后无所谓，如果出现了子父关系，父必须在后面。

注意：
		一旦try里面出了问题，就会在这里把问题给抛出去，然后和catch里面的问题进行匹配，
		一旦有匹配的，就执行catch里面的处理，然后结束了try...catch
		继续执行后面的语句。

 JDK7出现了一个新的异常处理方案：
 		try{

 		}catch(异常名1 | 异常名2 | ...  变量 ) {
 			...
 		}

 		注意：这个方法虽然简洁，但是也不够好。
 			A:处理方式是一致的。(实际开发中，好多时候可能就是针对同类型的问题，给出同一个处理)
			B:多个异常间必须是平级关系。

 在try里面发现问题后，jvm会帮我们生成一个异常对象，然后把这个对象抛出，和catch里面的类进行匹配。
    如果该对象是某个类型的，就会执行该catch里面的处理信息。

    异常中要了解的几个方法：
    public String getMessage():异常的消息字符串
    public String toString():返回异常的简单信息描述
            此对象的类的 name(全路径名)
            ": "（冒号和一个空格）
            调用此对象 getLocalizedMessage()方法的结果 (默认返回的是getMessage()的内容)
    printStackTrace() 获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台。
 */
public class ManyExceptionLearn {
    public static void main(String[] args) {


        //method2();
        //method3();

        //newMethod4();


        //常见的异常中使用的方法
        method5();

    }

    private static void method5() {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sdf.parse(s);
            System.out.println(s);
        } catch (ParseException e) {
            //
            //e.printStackTrace();

            //异常的消息字符串
            //System.out.println(e.getMessage());

            System.out.println(e.toString());
        }
    }

    private static void newMethod4() {
        int a = 10;
        int b = 0;
        int [] arr = {1,2,3,4,5};
        try{
            System.out.println( a / b );
            System.out.println(arr[5]);
            System.out.println("出了一个不知道如何处理的异常，使用父类Exception接收");
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
              System.out.println("除数不能为0");
              System.out.println("索引越界");
              System.out.println("出问题了");
        }

        System.out.println("over");
    }


    public static void method3(){
        int a = 10;
        int b = 0;
        int [] arr = {1,2,3,4,5};
        try{
            System.out.println( a / b );
            System.out.println(arr[5]);
            System.out.println("出了一个不知道如何处理的异常，使用父类Exception接收");
        }catch (ArithmeticException ae){
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("索引越界");
        }catch (Exception e){
            System.out.println("出问题了");
        }

        System.out.println("over");



    }

    public static void method2(){
        int a = 10;
        int b = 0;
        try{
            System.out.println( a / b );
        }catch (ArithmeticException ae){
            System.out.println("除数不能为0");
        }


        int [] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("索引越界");
        }

        System.out.println("over");
    }



    public static void method1(){
        int a = 10;
        int b = 0;
        try {
            int res = a / b;
        }catch (ArithmeticException ae){
            System.out.println("除数不能为0");
        }finally {
            System.out.println("over");
        }
    }
}
