package cn.itcast.code.day08;

public class ExtendsInterviewFirst {

    public static void main(String[] args) {
        Son2 s = new Son2();
        s.show();
    }
}

class Fu2{
    public  int num = 10;
    public Fu2(){
        System.out.println("fu2");
    }
}


class Son2 extends Fu2 {
    public  int num = 20;
    public Son2(){
        System.out.println("Son2");
    }

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
