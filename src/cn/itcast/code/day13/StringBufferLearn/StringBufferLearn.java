package cn.itcast.code.day13.StringBufferLearn;
/*
    构造方法
        public StringBuffer() ：无参构造方法
        public StringBuffer(int capacity):指定容量的字符串缓冲区对象
        public StringBuffer(String str)：指定字符串内容的字符串缓冲区对象
    成员方法
        public int capacity()：返回当前容量，理论值
        public int length()： 返回长度（字符数），实际值

    添加功能
        public StringBuffer append(String str) :可以把任意类型的数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
        public StringBuffer insert(int offset,String str)可以把任意类型的数据添加到字符串缓冲区里面，可以指定位置，并返回字符串缓冲区本身
    删除功能
        public StringBuffer deleteCharAt(int index):删除指定位置的字符并返回本身
        public StringBuffer delete(int start,int end)：删除指定位置的字符,包左不包右
    替换功能
        public StringBuffer replace(int start,int end,String str):从start开始到end,用str替换
    反转功能
    	public StringBuffer reverse()
    截取功能
        public String substring(int start):
        public String substring(int start,int end)
    截取功能和前面几个功能的不同
        返回值类型是String类型，本身没有发生改变





 */

public class StringBufferLearn {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb: " + sb);
        System.out.println("sb.capacity: " + sb.capacity());
        System.out.println("sb.length: " + sb.length());
        System.out.println("----------");

        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("sb2: " + sb2);
        System.out.println("sb2.capacity: " + sb2.capacity());
        System.out.println("sb2.length: " + sb2.length());
        System.out.println("----------");

        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println("sb3: " + sb2);
        System.out.println("sb3.capacity: " + sb3.capacity());
        System.out.println("sb3.length: " + sb3.length());
        System.out.println("----------");

        StringBuffer sb4 = new StringBuffer();

        sb4.append("hello");
        sb4.append(true);
        sb4.append(123);
        sb4.append(123.21);
        //链式编程
        sb4.append("java").append("i").append(123);
        System.out.println("sb4: " + sb4);
        System.out.println("----------");
        sb4.insert(5,"liguang");
        System.out.println("sb4: " + sb4);
        System.out.println("----------");
        sb4.deleteCharAt(1);
        System.out.println("sb4: " + sb4);
        System.out.println("-------------");
        sb4.deleteCharAt(1);
        System.out.println("sb4: " + sb4);
        System.out.println("-----------");
        sb4.delete(3,10);
        System.out.println("sb4: " + sb4);
        System.out.println();
        //删除所有
        sb4.delete(0,sb4.length());
        System.out.println("sb4: " + sb4);
        System.out.println("------------");

        StringBuffer sb5 = new StringBuffer();
        sb5.append("hello").append("world").append("java");
        System.out.println("sb5: " + sb5);
        System.out.println("-------------");
        sb5.replace(5,10,"liguang");
        System.out.println("sb5: " + sb5);
        System.out.println("-------------");

        StringBuffer sb6  = new StringBuffer();
        sb6.append("霞青林爱我");
        sb6.reverse();
        System.out.println("sb6: " + sb6);
        System.out.println("-------------");

        StringBuffer sb7 = new StringBuffer();
        sb7.append("helloworld");
        String subS7 = sb7.substring(5);
        System.out.println("subS7: " + subS7);
        System.out.println("sb7:" + sb7);
        System.out.println("-------------");
        String subS7Sub = sb7.substring(0,sb7.length());
        System.out.println("subS7Sub: " + subS7Sub);
        System.out.println("sb7:" + sb7);
        System.out.println("-------------");








    }
}
