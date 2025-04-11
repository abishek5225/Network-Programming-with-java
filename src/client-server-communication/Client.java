import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",3000);
            System.out.println("Connected to server");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}