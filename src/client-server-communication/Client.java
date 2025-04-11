import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",3000);
            System.out.println("Connected to server");

            BufferedReader input= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output= new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleInput=new BufferedReader(new InputStreamReader(System.in));

            String serverMessage, clientReply;
            while(true){
                //send message to server
                System.out.println("Client:");
                clientReply = consoleInput.readLine();
                output.println(clientReply);

                if(clientReply.equalsIgnoreCase("exit")) break;

                // Read server reply
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}