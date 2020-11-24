package cn.itcast.code.day20.RecurrenceLearn;
/*
    递归：方法定义中调用方法本身的现象

方法的嵌套调用，这不是递归。
Math.max(Math.max(a,b),c);

public void show(int n) {
		if(n <= 0) {
			System.exit(0);
		}
		System.out.println(n);
		show(--n);
}

注意事项：
		A:递归一定要有出口，否则就是死递归
		B:递归的次数不能太多，否则就内存溢出
		C:构造方法不能递归使用

举例：
		A:从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
			从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
				从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
					从前有座山，山里有座庙，庙里有个老和尚和小和尚，老和尚在给小和尚讲故事，故事是：
						...
					庙挂了,或者山崩了
		B:学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
			 学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
				学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
					学编程  -- 高薪就业 -- 挣钱 -- 娶媳妇 -- 生娃娃 -- 放羊 -- 挣学费
						...
					娶不到媳妇或者生不了娃娃

需求：求阶乘
    循环实现
    递归实现
        a:做递归要写一个方法
        b:出口条件
        c:规律

 */

public class RecurrenceLearn {
    public static void main(String[] args) {

        System.out.println(jieChen(5));
        System.out.println("-----");
        System.out.println(fib((20)));

    }

    public static int jieChen(int n){
        if(n==1){
            return 1;
        }else {
            return n * jieChen(n - 1);
        }
    }


    //不死神兔递归实现
    public static int fib(int n){
        if(n == 1 | n == 2){
            return 1;
        }else {
            return fib(n -1) + fib(n - 2);
        }
    }
}
