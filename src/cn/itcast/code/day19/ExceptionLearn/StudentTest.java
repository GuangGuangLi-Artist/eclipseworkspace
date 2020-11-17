package cn.itcast.code.day19.ExceptionLearn;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) throws MyExceptionLearn {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = sc.nextInt();


        Teacher t = new Teacher();
        t.check(score);

    }
}
