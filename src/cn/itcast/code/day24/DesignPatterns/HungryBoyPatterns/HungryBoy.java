package cn.itcast.code.day24.DesignPatterns.HungryBoyPatterns;

public class HungryBoy {

    private  HungryBoy(){

    }

    private  static HungryBoy hb = null;

    public synchronized  static HungryBoy getHungryBoy(){

        if(hb == null){
            hb = new HungryBoy();
        }

        return hb;
    }
}
