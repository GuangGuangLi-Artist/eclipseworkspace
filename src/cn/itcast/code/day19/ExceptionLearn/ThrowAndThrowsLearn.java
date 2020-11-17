package cn.itcast.code.day19.ExceptionLearn;

public class ThrowAndThrowsLearn {
    public static void main(String[] args) {

        try {
            method();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void method() throws Exception{
        int a = 10;
        int b = 0;

        if(b == 0){
            throw new Exception();
        }else {
            System.out.println(a / b);
        }
    }
}
