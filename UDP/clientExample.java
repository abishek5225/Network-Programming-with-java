import java.net.*;


public class clientExample{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket= new DatagramSocket();
        String message= "hello server";
        
        InetAddress address =InetAddress.getByName("localhost");
        int port= 9999;
        byte[] buffer=message.getBytes();

        DatagramPacket packet = new DatagramPacket(buffer,buffer.length,address, port);
        socket.send(packet);

        //receive response from server
        byte[] receivebuffer=new byte[1024];

       DatagramPacket receivePacket = new DatagramPacket(receivebuffer, receivebuffer.length);

        socket.receive(receivePacket);

        String response= new String(receivePacket.getData(),0,receivePacket.getLength());

        System.out.println("Server: "+response);
        socket.close();
        
    }
}