package SecureSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class First {
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

        //read response
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while((line=in.readLine()) != null){
            System.out.println(line);
        }

        out.close();
        in.close();
        socket.close();


       }catch(Exception ex){
        System.out.println("Following exception occured: "+ex);
       }
    }
}
