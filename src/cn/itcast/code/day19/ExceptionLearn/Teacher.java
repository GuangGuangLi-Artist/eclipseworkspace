package cn.itcast.code.day19.ExceptionLearn;

public class Teacher {
    public void check(int score) throws MyExceptionLearn{
        if(score > 100 || score < 0){
            throw new MyExceptionLearn("分数必须在0-100之间");
        }else {
            System.out.println("分数正确");
        }
    }


   /* 针对继承自RuntimeException
   public void check(int score) throws MyExceptionLearn{
        if(score > 100 || score < 0){
            throw new MyExceptionLearn();
        }else {
            System.out.println("分数正确");
        }
    }*/
}
