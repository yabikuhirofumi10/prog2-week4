
public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("main method runs");
        //git test 2
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("yabiku"); 
        bot1.greeting();
        bot2.greeting();
        bot2.setName("javis");
        bot2.greeting();
    } 
    
}
