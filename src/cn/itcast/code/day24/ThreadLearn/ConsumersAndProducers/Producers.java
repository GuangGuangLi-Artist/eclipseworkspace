package cn.itcast.code.day24.ThreadLearn.ConsumersAndProducers;

public class Producers implements Runnable {
    private ResourcesDemo rd;
    private int x = 0;

    public Producers(ResourcesDemo rd){
        this.rd = rd;
    }

    @Override
    public void run() {
        while (true){
                if(x % 2 == 0){
                    rd.set("李广",18);
                    //rd.name = "李广";
                    //rd.age = 18;
                }else {
                    rd.set("苏彪",16);
                    //rd.name = "苏彪";
                    //rd.age = 16;
                }
                x++;


        }
    }
}
