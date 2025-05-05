package SpamandLogfiles;

public class SpamcheckExample {
    public static void main(String[] args) {
        String email = "Congrsatulations! You've won a $1000 cash prize!";

        String[] spamwords= {"won", "prize", "cash", "urgent"};

        boolean isSpam= false;

        for(String word: spamwords){
            if(email.toLowerCase().contains(word)){
                isSpam = true;
                break;
            }
        }
        if(isSpam){
            System.out.println("This is a spam email");
        }
        else{
            System.out.println("Not a spam email");
        }

    }
    
}
