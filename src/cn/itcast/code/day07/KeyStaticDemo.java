package cn.itcast.code.day07;

public class KeyStaticDemo {
    public static void main(String[] args) {
        Person p = new Person("liguang",12,"zh-cn");
        p.show();

    }
}



class Person{
    String name;
    int age;
    String country;
    public Person(){}


    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void show(){
        System.out.println("姓名: " + name + " ,年龄: " + age + " ,国籍 " + country);
    }
}