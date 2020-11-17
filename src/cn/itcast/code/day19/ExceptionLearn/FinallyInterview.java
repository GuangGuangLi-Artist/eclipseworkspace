package cn.itcast.code.day19.ExceptionLearn;

public class FinallyInterview {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    private static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        }catch (ArithmeticException e){
            a = 30;
            return a;
        }finally {
            a = 40;

        }
        return a;

    }


}
