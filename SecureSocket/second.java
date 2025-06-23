package SecureSocket;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

public class second {
    public static void main(String[] args) {
        try{
            int port= 3005;
        System.setProperty("javax.net.ssl.keyStore", "serverkeystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "password");

        SSLServerSocketFactory sslServerSocketFactory=(SSLServerSocketFactory) SSLServerSocketFactory.getDefault();

        SSLServerSocket serverSocket=(SSLServerSocket) sslServerSocketFactory.createServerSocket(port);
        System.out.println("Server is running on port" +port);

        SSLSocket clientSocket=(SSLSocket) serverSocket.accept();
        System.out.println("Client connected");
        }catch(Exception ex){
            System.out.println("Exception occured: "+ ex);
        }
    }
}
