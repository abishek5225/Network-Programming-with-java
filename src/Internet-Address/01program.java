import java.net.*;

public class InetAddressDemo{
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getByName("www.google.com");

            System.out.println("Host name"+ address.getHostName());
        }
    }
}