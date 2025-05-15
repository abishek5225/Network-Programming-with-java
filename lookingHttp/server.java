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

            while (true) {
                String line;
                StringBuilder request = new StringBuilder();

                while ((line=in.readLine()) != null && !line.isEmpty()) {
                    request.append(line).append("\n");
                }
                if(request.toString().isEmpty()) break;

                System.out.println("Received request"+ (++requestCount));

                String body= "<h1>Hello from Keep-Alive Server</h1>";
                String response=
                "HTTP/1.1 200 OK\r\n"+
                "Content-Length:"+ body.length() + "\r\n"+
                "Content-type: text/html\r\n"+
                "Connection: keep-alive\r\n"+
                "keep-alive: timeout=10, max=5\r\n"+
                "\r\n"+
                body;
            
            out.write(response);
            out.flush();

            if(requestCount >=5){
                System.out.println("Max request reached closing connection..");
                socket.close();
                break;
            }
        }

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
