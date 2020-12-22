package cn.itcast.code.day24.DesignPatterns.HungryBoyPatterns;

public class HungryBoyDemo {

    public static void main(String[] args) {


        HungryBoy hb1 = HungryBoy.getHungryBoy();
        HungryBoy hb2 = HungryBoy.getHungryBoy();


        System.out.println(hb1 == hb2);
    }
}
