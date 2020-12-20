package cn.itcast.code.day24.ThreadLearn.ExecutorsLearn;

import java.util.concurrent.Callable;

public class CallableLearn  implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }
        return null;
    }
}
