package SecureSocket;

import java.io.PrintWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class client {
    public static void main(String[] args) {
       String host= "www.google.com";
       int port= 443;

       try{
        SSLSocketFactory Factory=(SSLSocketFactory)SSLSocketFactory.getDefault();

        SSLSocket socket=(SSLSocket)Factory.createSocket(host,port);

        //sends a hhtp get request
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        out.println("GET/HTTP/1.1");
        out.println("Host: "+host);
        out.println("Connectikon close");
        out.println();//ENd a request header

       }catch(Exception ex){
        System.out.println("Following exception occured: "+ex);
       }
    }
}
