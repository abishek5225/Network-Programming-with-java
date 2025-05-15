package lookingHttp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class client {
    public static void main(String[] args){
        
        try(Socket socket= new Socket("localhost", 8080)){
            System.out.println("Connected to server");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            for(int i=1;i<=5;i++){
                System.out.println("Sending request"+i);

                 String request= "GET/HTTP/1.1\r\n"+
                                    "Host: localhost\r\n"+
                                    "Connection: keep-alive\r\n"+
                                    "\r\n";

                out.write(request);
                out.flush();


                //Read response
                String line;
                
            }
            
            
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
