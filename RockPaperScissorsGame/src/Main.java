import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Strings
        String playersPlay;
        String computerPlay = "";
        int computersInt;

        //Scanner for input, Random generator for computers choice.
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //startup message
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors.");

        //Randomly generate computers choice
        computersInt = generator.nextInt(3) + 1;

        //Translate computers randomly generated number to our string using if statements
        if (computersInt == 1)
            computerPlay = "r";
        else if (computersInt == 2)
            computerPlay = "p";
        else if (computersInt == 3)
            computerPlay = "s";

        //Get the players play
        playersPlay = scan.next();

        //Make players choice lowercase
        playersPlay = playersPlay.toLowerCase();

        //Send outcome messages
        if (playersPlay.equals(computerPlay)) {
            if (playersPlay.equalsIgnoreCase("r")) {
                System.out.println("Draw!\nComputer Choice: rock\t\tPlayer choice: rock");
            } else if (playersPlay.equalsIgnoreCase("p")) {
                System.out.println("Draw!\nComputer Choice: paper\t\tPlayer choice: paper");
            } else if (playersPlay.equalsIgnoreCase("s")) {
                System.out.println("Draw!\nComputer Choice: scissors\t\tPlayer choice: scissors");
            }
        }
        //User chooses rock
        if (playersPlay.equalsIgnoreCase("r")) {
            if (computerPlay.equalsIgnoreCase("p")) {
                System.out.println("You lose!\nComputer Choice: paper\t\tPlayer choice: rock");
            } else if (computerPlay.equalsIgnoreCase("s")) {
                System.out.println("You win!\nComputer Choice: scissors\t\tPlayer choice: rock");
            }
        }
        //User chooses paper
        else if (playersPlay.equalsIgnoreCase("P")) {
            if (computerPlay.equalsIgnoreCase("r")) {
                System.out.println("You win!\nComputer Choice: rock\t\tPlayer choice: paper");
            } else if (computerPlay.equalsIgnoreCase("s")) {
                System.out.println("You lose!\nComputer Choice: scissors\t\tPlayer choice: paper");
            }
        } else {
            //User chooses scissors
            if (playersPlay.equalsIgnoreCase("s")) {
                if (computerPlay.equalsIgnoreCase("r")) {
                    System.out.println("You lose!\nComputer Choice: rock\t\tPlayer choice: scissors");
                } else if (computerPlay.equalsIgnoreCase("p")) {
                    System.out.println("You win!\nComputer Choice: paper\t\tPlayer choice: scissors");
                }
            } else {
                //Invalid selection message
                System.out.println("Invalid selection please try again.");
                //end game
                System.exit(0);
            }
        }
    }
}
