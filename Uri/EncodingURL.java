package Uri;

import java.net.URLEncoder;

public class EncodingURL {
    public static void main(String[] args) {
        try{
            String name= "Abishek Chaulagain@Dhulabari";
        

        String encoded=URLEncoder.encode(name,"UTF-8");

        System.out.println(encoded);
        }catch(Exception ex){
            System.out.println("Exception occured: "+ex);
        }

    }
    
}
