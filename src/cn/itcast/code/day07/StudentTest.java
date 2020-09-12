package cn.itcast.code.day07;
/*
封装和private的应用
    把成员变量用private修饰
    提供对应的getxxx()和setxxx（）方法
 */
public class StudentTest {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
