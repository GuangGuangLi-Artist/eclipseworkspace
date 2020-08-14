package cn.itcast.day01;

public class TimeTest {
    public static void main(String[] args) {
        Long current = System.currentTimeMillis();
        Long current_x = current + 10000000;
        String start = current.toString();
        String end = current_x.toString();

        System.out.println(start);
        System.out.println(end);
    }

}
