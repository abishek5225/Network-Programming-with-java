package clientmode;

import java.io.PrintWriter;
import java.net.Socket;

public class first {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",3000);

            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            out.println("Hello from client");

        }catch(Exception ex){
            System.out.println("Exception occured:" +ex);
        }
    }
    
}
