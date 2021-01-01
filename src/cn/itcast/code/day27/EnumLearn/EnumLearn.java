package cn.itcast.code.day27.EnumLearn;

public enum EnumLearn {

    //通过JDK5提供的枚举来做枚举类
    FRONT("前"){
        @Override
        public void show() {
            System.out.println("前");
        }
    }, BEHIND("后"){
        @Override
        public void show() {
            System.out.println("后");
        }
    }, LEFT("左"){
        @Override
        public void show() {
            System.out.println("左");
        }
    }, RIGHT("右"){
        @Override
        public void show() {
            System.out.println("右");
        }
    };

    private String name;

    private EnumLearn(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public abstract void show();


}
