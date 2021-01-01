package cn.itcast.code.day27.EnumLearn;

public class EnumMethod {
    public static void main(String[] args) {
        // int compareTo(E o)
        EnumLearn d21 = EnumLearn.FRONT;
        EnumLearn d22 = EnumLearn.BEHIND;
        EnumLearn d23 = EnumLearn.LEFT;
        EnumLearn d24 = EnumLearn.RIGHT;
        System.out.println(d21.compareTo(d21));
        System.out.println(d21.compareTo(d24));
        System.out.println(d24.compareTo(d21));
        System.out.println("---------------");
        // String name()
        System.out.println(d21.name());
        System.out.println(d22.name());
        System.out.println(d23.name());
        System.out.println(d24.name());
        System.out.println("--------------");
        // int ordinal()
        System.out.println(d21.ordinal());
        System.out.println(d22.ordinal());
        System.out.println(d23.ordinal());
        System.out.println(d24.ordinal());
        System.out.println("--------------");
        // String toString()
        System.out.println(d21.toString());
        System.out.println(d22.toString());
        System.out.println(d23.toString());
        System.out.println(d24.toString());
        System.out.println("--------------");
        // <T> T valueOf(Class<T> type,String name)
        EnumLearn d = Enum.valueOf(EnumLearn.class, "FRONT");
        System.out.println(d.getName());
        System.out.println("----------------");
        // values()
        // 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
        EnumLearn[] dirs = EnumLearn.values();
        for (EnumLearn d2 : dirs) {
            System.out.println(d2);
            System.out.println(d2.getName());
        }
    }
}
