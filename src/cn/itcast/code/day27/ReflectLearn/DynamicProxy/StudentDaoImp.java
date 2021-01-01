package cn.itcast.code.day27.ReflectLearn.DynamicProxy;

public class StudentDaoImp implements StudentDao {

    @Override
    public void login() {
        System.out.println("登录功能");
    }

    @Override
    public void register() {
        System.out.println("注册功能");
    }
}
