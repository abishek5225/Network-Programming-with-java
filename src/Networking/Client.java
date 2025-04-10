package Networking;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",5000);

            //read message from server
            InputStream input = socket.getInputStream();
            BufferedReader reader= new BufferedReader(new InputStreamReader(input));

            String message= reader.readLine();

        }
    }
}