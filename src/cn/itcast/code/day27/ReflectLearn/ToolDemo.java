package cn.itcast.code.day27.ReflectLearn;

public class ToolDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        NewPerson np = new NewPerson();
        Tool tl = new Tool();
        tl.setProperty(np,"name","林青霞");
        tl.setProperty(np,"age",27);

        System.out.println(np);

    }
}


class NewPerson{
    private String name;
    int age;

    @Override
    public String toString() {
        return name + "---" +  age;
    }
}
