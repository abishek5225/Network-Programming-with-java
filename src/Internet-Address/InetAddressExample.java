import java.net.*;

public class InetAddressExample{
    public static void main(String[] args) {
        try{
            /* 
            InetAddress[] address = InetAddress.getAllByName("www.google.com");
            for (InetAddress addresscontainer : address) {
                System.out.println("Host name: " + addresscontainer.getHostName());
                System.out.println("IP address: " + addresscontainer.getHostAddress());
                System.out.println("Canonical host name: " + addresscontainer.getCanonicalHostName());
                System.out.println();

                System.out.println("Host name: " + address.toString());
                System.out.println();

                
            }
            */

            

            
            
            InetAddress address=InetAddress.getByName("8.8.8.8");

            System.out.println("Host name: "+ address.getHostName());
            System.out.println("IP address: "+ address.getHostAddress());
            // System.out.println("canonical hostname: "+address.getCanonicalHostName());

            //localhost info
            // InetAddress local=InetAddress.getLocalHost();
            // System.out.println("Local host name: "+ local.getHostName());
            // System.out.println("Local IP address: "+ local.getHostAddress());
            // System.out.println("Local canonical hostname: "+ local.getCanonicalHostName());

            
            // if(address instanceof Inet4Address){
            //     System.out.println("IPv4 address");
            // }else if(address instanceof Inet6Address){
            //     System.out.println("IPv6 address");
            // }else{
            //     System.out.println("Unknown address type");
            // }


        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}