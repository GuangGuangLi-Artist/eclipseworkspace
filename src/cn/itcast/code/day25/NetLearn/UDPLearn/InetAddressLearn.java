package cn.itcast.code.day25.NetLearn.UDPLearn;
/*
    如果一个类没有构造方法：
    A:成员全部是静态的(Math,Arrays,Collections)
    B:单例设计模式(Runtime)
    C:类中有静态方法返回该类的对象(InetAddress)
            class Demo {
                private Demo(){}

                public static Demo getXxx() {
                    return new Demo();
                }
            }

    看InetAddress的成员方法：
    public static InetAddress getByName(String host):根据主机名或者IP地址的字符串表示得到IP地址对象
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressLearn {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getByName("192.168.43.99");

        //获取主机名和IP地址
        String name = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println(name + "--" + ip);
    }
}
