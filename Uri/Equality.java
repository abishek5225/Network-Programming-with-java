package Uri;

import java.net.URL;

public class Equality {
    public static void main(String[] args) {
        try{
            URL url1=new URL("https://google..com");
            URL url2=new URL("https://google..com");
            if (url1.equals(url2)) {
                System.out.println("Same Url");
            }

        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
}
