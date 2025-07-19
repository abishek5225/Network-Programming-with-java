package Uri;

import java.net.*;
import java.io.*;

public class RetrivingData{
    public static void main(String[] args) {
       try{
         URI uri=new URI("https://www.facebook.com/");
         URL url=uri.toURL();

        BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while((line=reader.readLine()) !=null){
            System.out.println(line);
        }
        reader.close();
       }catch(Exception ex){
        System.out.println("Exception occured:"+ ex);
       }
    }
}   