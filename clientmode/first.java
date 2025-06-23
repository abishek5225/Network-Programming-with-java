package clientmode;

import java.net.Socket;

public class first {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",3000);

        }catch(Exception ex){
            System.out.println("Exception occured:" +ex);
        }
    }
    
}
