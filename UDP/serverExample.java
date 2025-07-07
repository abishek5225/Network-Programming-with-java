import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class serverExample{
    public static void main(String[] args)throws Exception {
        DatagramSocket socket=new DatagramSocket(9999);
        byte[] buffer=new byte[1024];
        
        System.out.println("Server is running");

        while (true) {
            DatagramPacket request=new DatagramPacket(buffer,buffer.length, 0);
            socket.receive(request);

            String message=new String(request.getData(), 0,request.getLength());
            System.out.println("CLient: " +message);

            String response="Hello from the server";
            byte[] Serverresponse=response.getBytes();

            InetAddress clientAddrss=request.getAddress();
            int clientport=request.getPort();

            DatagramPacket reply= new DatagramPacket(Serverresponse,Serverresponse.length, clientAddrss,clientport);
            socket.send(reply);
        }
    }
}