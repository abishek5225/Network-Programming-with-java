import java.net.*;

public class InetAddressExample{
    public static void main(String[] args) {
        try{
            
            InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
            for (InetAddress address : addresses) {
                System.out.println("Host name: " + address.getHostName());
                System.out.println("IP address: " + address.getHostAddress());
                System.out.println("Canonical host name: " + address.getCanonicalHostName());
                System.out.println();

                System.out.println("Host name: " + address.toString());
                System.out.println();
            }
            
            /* 
            InetAddress address=InetAddress.getByName("8.8.8.8");

            System.out.println("Host name: "+ address.getHostName());
            System.out.println("IP address: "+ address.getHostAddress());
            System.out.println("canonical hostname: "+address.getCanonicalHostName());

            //localhost info
            InetAddress local=InetAddress.getLocalHost();
            System.out.println("Local host name: "+ local.getHostName());
            System.out.println("Local IP address: "+ local.getHostAddress());
            System.out.println("Local canonical hostname: "+ local.getCanonicalHostName());

            */
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}