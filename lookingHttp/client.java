package lookingHttp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class client {
    public static void main(String[] args){
        
        try(Socket socket= new Socket("localhost", 8080)){
            System.out.println("Connected to server");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            
        } catch (Exception e) {
           System.out.println(e);
        }
        
    }
}
