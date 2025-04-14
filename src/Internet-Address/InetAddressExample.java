import java.net.*;

public class InetAddressExample{
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getByName("8.8.8.8");

            System.out.println("Host name: "+ address.getHostName());
            System.out.println("IP address: "+ address.getHostAddress());
            System.out.println("canonical hostname: "+address.getCanonicalHostName());


        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}