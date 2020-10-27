package cn.itcast.code.day16.GenericLearn;

public class GenericInterfaceTest {
    public static void main(String[] args) {


        //第一种情况的测试
//        GenericInterface<String> glf = new GenericInterfaceImpl();
//        glf.show("泛型接口好复杂啊");

        //第二种情况的测试

        GenericInterface<String> glf = new GenericInterfaceImpl<>();
        glf.show("java");

        System.out.println("------");
        GenericInterface<Integer> glf2 = new GenericInterfaceImpl<>();
        glf2.show(100);




    }
}
