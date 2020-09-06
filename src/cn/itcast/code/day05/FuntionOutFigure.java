package cn.itcast.code.day05;

public class FuntionOutFigure {
    public static void main(String[] args) {
      /*  for(int x=0;x<4;x++){
            for(int y=0;y<5;y++){
                System.out.print("*");
            }
            System.out.println();
        }*/
      outFigure(6,7);
      System.out.println("---------------");
      outFigure(12,13);
      System.out.println("---------------");



    }

    //写方法  写一个返回m行，n列的图形
    public static void outFigure(int m,int n){
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
