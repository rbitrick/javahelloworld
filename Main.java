import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now(
            ZoneId.systemDefault()
        );
        int playercard1 = (int)(Math.random() * (13-1))+1;
        int playercard2 = (int)(Math.random() * (13-2))+2;
        int dealercard1 = (int)(Math.random() * (13-2))+2;
        int dealercard2 = (int)(Math.random() * (13-2))+2;
        int ran1 = (int)(Math.random() * (3-1))+1;
        String facecard1 = "Test";
        
        DateTimeFormatter dateformatted = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = time.format(dateformatted);
        System.out.println("Hello everyone! The current date and time is: " + formattedDate);
        System.out.println("Lets play some Blackjack!");
        System.out.println("First player card: " + playercard1);
        if (playercard1 > 10) {
            if (ran1 == 1) {
                facecard1 = "Joker";
            }    
            else if (ran1 == 2){
                facecard1 = "Queen";
            }
            else if (ran1 == 3){
                facecard1 = "King";
            }
        }
        System.out.println("You got a " + facecard1 + "!!");
        
        if (playercard1 == 1) {
            while(true){
            System.out.println("You got an ACE!!! High or Low?");
            Scanner acein1 = new Scanner(System.in);
            String ace1 = acein1.nextLine();   
            if (ace1.equalsIgnoreCase("High")){
                playercard1 = 11;
                break;

            }
            else if (ace1.equalsIgnoreCase("Low")) {
                playercard1 = 1;
                break;
            }
            else {
                System.out.println("You did not answer the question. Please Try Again");       
            } 
            }
        
        }
        
        System.out.println("First dealer card: " + dealercard1);
        if (playercard2 == 1) {
            while(true){
            System.out.println("You got an ACE!!! High or Low?");
            Scanner acein1 = new Scanner(System.in);
            String ace1 = acein1.nextLine();   
            if (ace1.equalsIgnoreCase("High")){
                playercard2 = 11;
                break;

            }
            else if (ace1.equalsIgnoreCase("Low")) {
                playercard2 = 1;
                break;
            }
            else {
                System.out.println("You did not answer the question. Please Try Again");       
            } 
            }
        
        }        
        System.out.println("Second player card: " + playercard2);
        int playertotal = playercard1 + playercard2;
        int dealertotal = dealercard1 + dealercard2;
        System.out.println("Your current total is: " + playertotal);
        if(playertotal < 21){
            while(true){
            System.out.println("Do you want to hit?");
            Scanner hitin1 = new Scanner(System.in);
            String hit1 = hitin1.nextLine();   
            if (hit1.equalsIgnoreCase("Yes")){
                playertotal = ran1 + playertotal;
                System.out.println("Your new total is: " + playertotal);
                break;

            }
            else if (hit1.equalsIgnoreCase("No")) {
                break;
            }
            else {
                System.out.println("You did not answer the question. Please Try Again");       
            } 
            }
        }
        else
            System.out.println("Bust!");



        
        
    }

}