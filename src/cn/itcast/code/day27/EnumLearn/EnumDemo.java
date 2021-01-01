package cn.itcast.code.day27.EnumLearn;

public class EnumDemo {
    public static void main(String[] args) {


        EnumLearn e = EnumLearn.FRONT;
        System.out.println(e);
        e.show();



        EnumLearn dd = EnumLearn.FRONT;
        dd = EnumLearn.LEFT;

        switch (dd) {
            case FRONT:
                System.out.println("你选择了前");
                break;
            case BEHIND:
                System.out.println("你选择了后");
                break;
            case LEFT:
                System.out.println("你选择了左");
                break;
            case RIGHT:
                System.out.println("你选择了右");
                break;
        }
    }

}
