package cn.itcast.code.day08;

public class MethodRewriting {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call("林青霞");
    }
}



class Phone{
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
}

class NewPhone extends Phone{
    public void call(String name){
        //System.out.println("给" + name + "打电话");
        super.call(name);
        System.out.println("可以听天气预报了");
    }

}