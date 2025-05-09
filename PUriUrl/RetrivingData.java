package PUriUrl;

import java.net.*;
import java.io.*;

public class RetrivingData {
    public static void main(String[] args)throws Exception {
        URL url=new URL("https://www.google.com");
        BufferedReader reader=new BufferedReader(
            new InputStreamReader(url.openStream())
        );
        String line;
        while ((line = reader.readLine()) !=null) {
            System.out.println(line);
        }
        reader.close();
        
    }
    
}
