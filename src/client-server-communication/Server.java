package client-server-communication;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        ServerSocket serverSocket=new ServerSocket(3000);
        System.out.println("Server started.. waiting for client...");

        Socket socket= serverSocket.accept();
        System.out.println("client connected");

        //Input and output setup




    }
}