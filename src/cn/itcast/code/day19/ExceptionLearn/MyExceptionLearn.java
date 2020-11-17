package cn.itcast.code.day19.ExceptionLearn;
public class MyExceptionLearn extends Exception {
    public MyExceptionLearn(){};

    public MyExceptionLearn(String message){
        super(message);

    }


}

/*
public class MyExceptionLearn extends RuntimeException{

}
*/
