package cn.itcast.code.day11.ObjectLearn;
/*
Object类概述:类层次结构的根类,所有类都直接或者间接的继承自该类

object类的方法：
    public int hashCode()：返回该对象的哈希码值
    注意：哈希值是更具哈希算法计算出来的一个值，这个值金额地址值相关，但是不是实际地址值，你可以理解为地址值
    public final Class getClass():返回此 Object 的运行时类
        Class类的方法：
            public String getName()：以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称。
    public String toString(): 等价于getClass().getName() + '@' + Integer.toHexString(hashCode())
            Integer类下的一个静态方法：
            public static String toHexString(int i)：以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。
            建议所有子类重写该方法
            怎么重写呢？
                把该类的所有成员变量值组成返回即可
                最终方案是自动生成toString方法
          直接输出一个对象的名称，其实就是调用该对象的toString()方法
    public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。
        默认情况下是比的是地址值
        重写：一般来说比较的的是成员变量值是否相同
        对象名 instanceof 类名 ：表示该对象名是否是该类名的一个对象

    ==：
        基本类型：比较的值是否相同
        引用类型：比较的地址值是否相同

    protected void finalize()：当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法，用于垃圾回收，但是什么时候回收是不确定的
    protected Object clone()：建并返回此对象的一个副本

    接口 Cloneable
        此类实现了 Cloneable 接口，以指示 Object.clone() 方法可以合法地对该类实例进行按字段复制。
        这个接口是标记接口，告诉我们实现该接口的类就可以实现对象的复制了






 */

public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student();
        System.out.println(s.hashCode());//1163157884

        Student s2 = new Student();
        System.out.println(s2.hashCode());//1956725890


        Student s3 = s;
        System.out.println(s3.hashCode());//1163157884

        System.out.println("--------");

        Student s1 = new Student();
        Class c = s.getClass();
        String name = c.getName();
        System.out.println(name);

        //链式编程
        String name2 = s1.getClass().getName();
        System.out.println(name2);

        System.out.println("---------");


        System.out.println(s.toString());
        System.out.println(s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));

        System.out.println("---------");
        System.out.println(s.toString());

        //直接输出对象的名称
        System.out.println(s);

        System.out.println("---------");

        Student s4 = new Student("林青霞",27);
        Student s5 = new Student("林青霞",27);

        System.out.println(s4==s5);//false
        Student s6 = s4;
        System.out.println(s4==s6);//true

        System.out.println("---------");
        System.out.println(s4.equals(s5));//false


        System.out.println("克隆方法重写的作用");
        Student s7 = new Student("liguang",28);
        Object obj = s7.clone();
        Student s8 = (Student)obj;




        System.out.println(s7.getName() + "---" + s7.getAge());
        System.out.println(s8.getName() + "---" + s8.getAge());
        Student s9 = s7;
        s9.setName("subiao");
        s9.setAge(30);
        System.out.println(s9.getName() + "---" + s9.getAge());
        System.out.println("---------");
        System.out.println(s7.getName() + "---" + s7.getAge());
        System.out.println(s8.getName() + "---" + s8.getAge());
        System.out.println(s9.getName() + "---" + s9.getAge());








    }
}
