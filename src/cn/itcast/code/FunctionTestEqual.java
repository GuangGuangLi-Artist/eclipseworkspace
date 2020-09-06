package cn.itcast.code;
/*
键盘例如两个数，p判断两个数是否相等

 */
import java.util.Scanner;

public class FunctionTestEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();

        Boolean result = isEqual(a,b);
        System.out.println("两个数比较的结果是: " + result);
    }




    public static Boolean isEqual(int a, int b){
        if(a == b){
            return true;
        }else {
            return false;
        }

    }
}
