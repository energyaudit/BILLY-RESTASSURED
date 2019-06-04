package src.main.Java2;

import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 * Created by byang on 2018-06-26.
 */

public class GetIPpcNameJava {
    public static void main(String args[]){
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("local Host IP:"+inetAddress.getHostAddress());
            NetworkInterface network = NetworkInterface.getByInetAddress(inetAddress);
            byte[] mac = network.getHardwareAddress();
            System.out.print("Current MAC address : ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String
                        .format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));//
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            InetAddress host = InetAddress.getByName("107.180.2.128");
            System.out.println("107.180.2.128 HostName is server"+host.getHostName());
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            InetAddress host = InetAddress.getByName("192.168.103.52");
            System.out.println("192.168.103.52 HostName is :"+host.getHostName());
        } catch(Exception e) {
            e.printStackTrace();
        }


        try {
            InetAddress[] hostAddresses = InetAddress.getAllByName("godaddy.com");
            for(InetAddress host:hostAddresses){
                System.out.println("get ip by domain name-godaddy.com: "+host.getHostAddress());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            InetAddress[] hostAddresses = InetAddress.getAllByName("www.51.ca");
            for(InetAddress host:hostAddresses){
                System.out.println("get ip by domain name-www.51.ca:"+host.getHostAddress());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }





    }
}