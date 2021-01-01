package cn.itcast.code.day27.ReflectLearn.DynamicProxy;

public class UserDaoImp implements UserDao {
    @Override
    public void add() {
        System.out.println("新增用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void find() {
        System.out.println("查找用户");
    }
}
