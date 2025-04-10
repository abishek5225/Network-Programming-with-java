package Networking;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try{
    ServerSocket serverSocket=new ServerSocket(5000);
            System.out.println("Server is running");

            Socket socket = serverSocket.accept();
            System.out.println("client connected");
;
            OutputStream output= socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello from the server");

            socket.close();
            serverSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}