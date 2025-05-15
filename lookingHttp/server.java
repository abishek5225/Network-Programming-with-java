package lookingHttp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket= new ServerSocket(8080);
        System.out.println("Server is running on port 8080");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("client connected");

            new Thread(()-> handleClient(clientSocket)).start();;
        }
    }
    public static void handleClient(Socket socket){
        try(
            BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        ){
            int requestCount= 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
