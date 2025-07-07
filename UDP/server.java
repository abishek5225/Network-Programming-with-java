import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class server{
    public static void main(String[] args)throws Exception {
        DatagramSocket socket=new DatagramSocket(9876);
        byte[] buffer=new byte[1024];
        
        System.out.println("Server is running");

        while (true) {
            DatagramPacket request=new DatagramPacket(buffer,buffer.length, 0);
            socket.receive(request);
            
        }
    }
}