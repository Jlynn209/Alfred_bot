import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String getting = String.format("hello %s. Lovely to see you.", name);
        return getting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("it is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        int Alexis = conversation.indexOf("Alexis");
        int Alfred = conversation.indexOf("Alfred");
        String response = "";

        if (Alexis >= 0){
            response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (Alfred >= 0){
            response = "At your service. As you wish, naturally.";
        }
        else {
            response = "Right. And with that I shall retire.";
        }
 
        return response;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

