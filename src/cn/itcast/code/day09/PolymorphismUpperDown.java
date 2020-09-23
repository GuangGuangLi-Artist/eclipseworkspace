package cn.itcast.code.day09;

public class PolymorphismUpperDown {
    public static void main(String[] args) {
        Fu7 f = new Zi7();

        //向下转型
        Zi7 z = (Zi7) f;
        z.method();
    }

}


class Fu7{
    public void show(){
        System.out.println("show fu");
    }

}

class Zi7 extends Fu7{

    public void show() {
        System.out.println("show zi");
    }

    public void method(){
        System.out.println("method zi");
    }
}
