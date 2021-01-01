package cn.itcast.code.day27.ReflectLearn;

public class PersonLearn {


    private String name;
    int age;
    public String gender;


    public PersonLearn(){

    }

    private PersonLearn(String name){
        this.name = name;
    }

    PersonLearn(String name,int age){
        this.name =name;
        this.age = age;
    }

    public PersonLearn(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void show(){
        System.out.println("show");
    }

    public void method(String s){
        System.out.println("method "  + s);
    }

    public String getString(String s, int i){
        return s + "----" + i;
    }

    private void function(){
        System.out.println("function");
    }


    @Override
    public String toString() {
        return "PersonLearn{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }


}
