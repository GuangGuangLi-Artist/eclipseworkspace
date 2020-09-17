package cn.itcast.code.day08;

public class ThisAndSuper {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
    }
}


class Father{
    public  int num =10;
}

class Son extends Father{
    public int num = 20;
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
