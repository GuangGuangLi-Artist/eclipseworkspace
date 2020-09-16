package cn.itcast.code.day08;

public class CodeBlock {
    public static void main(String[] args) {

        Block b = new Block();


        //局部代码块，在方法中
        {
            String L_B = "Local code block";
            System.out.println(L_B);
        }
    }

}


class Block{

    //构造代码块
    {
        String B_Y = "Building code blocks";
        System.out.println(B_Y);
    }

    //静态代码块
    static {
        String S_C = "statticBlock";
        System.out.println(S_C);
    }

}
