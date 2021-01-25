package Java.网络编程;

/**
 * @author: Administrator
 * @date: 2021/1/25 10:15
 * @description:
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdress {
    public static void main(String[] args) {
        try {
            //查询ip地址
            InetAddress address = InetAddress.getByName("127.0.0.1");
            InetAddress address1 = InetAddress.getByName("www.baidu.com");
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(address1);
            System.out.println(address);
            System.out.println(localHost);
            System.out.println(InetAddress.getAllByName("127.0.0.1"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}


