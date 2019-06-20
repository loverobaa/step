package com.nn.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lesson1 {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
            System.out.println(address.getAddress());
            //字节数组
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            System.out.println(address.getCanonicalHostName());
            InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
            System.out.println(loopbackAddress);

//            InetAddress ubuntu = InetAddress.getByName("ubuntu");
//            System.out.println(ubuntu.getHostAddress());

            InetAddress byName = InetAddress.getByName("192.168.0.188");
            System.out.println(byName.getHostName());
            System.out.println(byName.getAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
