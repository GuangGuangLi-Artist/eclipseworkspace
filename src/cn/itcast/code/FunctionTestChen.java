package cn.itcast.code;

import java.util.Scanner;

public class FunctionTestChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = sc.nextInt();
        chenFa(n);

    }

    public static void chenFa(int n){
        for(int x=1;x<=n;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y + "*" + x + "=" + y * x  + "\t");
            }
            System.out.println();
        }
    }
}
