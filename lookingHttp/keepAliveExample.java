package lookingHttp;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class keepAliveExample {
public static void main(String[] args) {
    try{
        URL url=new URL("https://www.examplee.com");
        HttpURLConnection con= (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Connection", "Keep-alive");

        BufferedReader in= new BufferedReader(
            new InputStreamReader(con.getInputStream())
        );
        String line;

        while ((line=in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();

    }catch(Exception ex){
        System.out.println(ex);
    }

}
    
}