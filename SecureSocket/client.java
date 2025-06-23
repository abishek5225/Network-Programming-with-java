package SecureSocket;

import javax.net.ssl.SSLSocketFactory;

public class client {
    public static void main(String[] args) {
       String host= "www.google.com";
       int port= 443;

       try{
        SSLSocketFactory Factory=(SSLSocketFactory)SSLSocketFactory.getDefault();
       }catch(Exception ex){
        System.out.println("Following exception occured: "+ex);
       }
    }
}
