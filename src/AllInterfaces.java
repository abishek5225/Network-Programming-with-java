

import java.net.*;
import java.util.*;

public class AllInterfaces {
    public static void main(String[] args) {
        try{
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while(interfaces.hasMoreElements()){
                NetworkInterface net = interfaces.nextElement();
                System.out.println("Interface Name: " + net.getName());
                System.out.println("Display Name: " + net.getDisplayName());
                System.out.println(net.isLoopback());
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
