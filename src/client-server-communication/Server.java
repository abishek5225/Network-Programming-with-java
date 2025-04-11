

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        try{
            ServerSocket serverSocket=new ServerSocket(3000);
            System.out.println("Server started.. waiting for client...");

            Socket socket= serverSocket.accept();
            System.out.println("client connected");

            //Input and output setup
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output= new PrintWriter(socket.getOutputStream(), true);

            //for typing in terminal
            BufferedReader consoleInput= new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverReply;

            while(true){
                //Read from client
                clientMessage= input.readLine();
                if(clientMessage.equalsIgnoreCase("exit")) break;
                System.out.println("client"+clientMessage);

                //send reply
                System.out.println("Server:");
                serverReply= consoleInput.readLine();
                output.println(serverReply);

                if(serverReply.equalsIgnoreCase("exit")) break;
            }
            socket.close();
            serverSocket.close();
            System.out.println("Connection closed...");
        }catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
