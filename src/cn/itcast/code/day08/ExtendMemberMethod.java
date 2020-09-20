package cn.itcast.code.day08;

public class ExtendMemberMethod {

    public static void main(String[] args) {

        Son5 s = new Son5();
        s.show();
        s.method();

    }
}


class Fu5{
    public void show(){
        System.out.println("show fu");
    }
}

class Son5 extends Fu5{


    public void method(){
        System.out.println("Method son");
    }


    public void show(){
        System.out.println("show son");
    }
}
