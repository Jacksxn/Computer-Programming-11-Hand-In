import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creating a new scanner for reading input from console
        Scanner scan = new Scanner(System.in);

        //Startup message
        System.out.println("\nEnter a word longer than 2 letters.");

        //Scanning the response to my startup message
        String input = (scan.next());

        //Making sure the word is longer than 2. If it is, the rest of this code will work fine.
        if (input.length() > 2) {

            //Creating variables for the rest of my code
            int end = (input.length());
            //Here I remove 2 letters from the end of the input
            int length = (input.length() - 2);
            //and put it to the start.
            String change = input.substring(length, end);
            String remain = input.substring(0, length);

            //Some messages to make things more organised.
            System.out.println("\nPrinting encrypted word...");

            //Printing the new encrypted word but also adding "fedo" to the end
            System.out.println(change + remain + "fedo\n");

            //another message for organisation
            System.out.println("Reverting encrypted word to normal...");

            //Reverting the encrypted message to the original input user sent by just sending them their input.
            System.out.println(input);

            //Saying that if the word is not 2 letters to send them an error message.
        } else {
            System.out.println("Invalid entry, input must be more than 2 characters long and must not contain any spaces.");
        }
    }
}