package cn.itcast.code.day10;

/*
	匿名内部类面试题：
		按照要求，补齐代码
			interface Inter7 { void show(); }
			class Outer7 { //补齐代码 }
			class AnonymousInnerInterviewClass {
				public static void main(String[] args) {
					  Outer7.method().show();
				  }
			}
			要求在控制台输出”HelloWorld”
*/

public class AnonymousInnerInterviewClass {
    public static void main(String[] args) {
        Outer7.method().show();
        /*
        1：Outer.method() 可以看出method（）应该是Outer中一个静态的方法
        2：Outer.method().show()可以看出method()方法的返回值是一个对象。
        由于接口Inter7中有一个show()方法，所以我认为method()方法的返回值类型是一个接口
         */
    }
}


interface Inter7 {
    public abstract void show();
}
class Outer7 {
    //补齐代码
    public static Inter7 method(){
        return new Inter7(){
            public void show(){
                System.out.println("Hello world");

            }
        };
    }
}
