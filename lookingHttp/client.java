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
                int blankLines =0;
                while ((line=in.readLine()) != null) {
                    System.out.println(line);
                    if(line.isEmpty()){
                        blankLines++;
                        if (blankLines==1) {
                            break; //end of header
                        }
                    }
                }
                Thread.sleep(2000);//waits for 2s

            }
            System.out.println("All request sent. closing client");
            
        } catch (Exception e) {
           System.out.println(e);
           System.out.println("problem occured");
        }
    }
}
