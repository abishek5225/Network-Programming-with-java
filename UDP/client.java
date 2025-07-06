import java.net.*;

import InternetAddress.InetAddressExample;

public class client{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket= new DatagramSocket();
        String message= "hello server";
        
        InetAddress address =InetAddress.getByName("locslhost");
        int port= 9876;
        byte[] buffer=message.getBytes();

        DatagramPacket packet = new DatagramPacket(buffer, port);
        socket.send(packet);

        //receive response from server
        byte[] receivebuffer=new byte[1024];

        DatagramPacket receivePacket=new DatagramPacket(receivebuffer, port);
        socket.receive(receivePacket);

        String response= new String(receivePacket.getData(),0,receivePacket.getLength());

        System.out.println("Server: "+response);
        socket.close();
        
    }
}