package cn.itcast.code.day24.ThreadLearn.ConsumersAndProducers;

public class Consumers  implements Runnable{

    private ResourcesDemo rd;

    public Consumers (ResourcesDemo rd){
        this.rd = rd;
    }

    @Override
    public void run() {
        while (true){
                rd.get();
        }

    }
}
