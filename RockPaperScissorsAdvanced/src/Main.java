import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Strings
        String playersPlay;
        String computerPlay = "";
        //Integers
        int playerWins = 0;
        int computerWins = 0;
        int computersInt;
        int b = 1;

        //Scanner for input, Random generator for computers choice.
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //startup message
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");

        //Looping our game, b != 0 doesn't do anything other than make it never automatically end.
        while (b != 0) {
            //Get the players play
            playersPlay = scan.next();

            //Make players choice lowercase
            playersPlay = playersPlay.toLowerCase();

            //Randomly generate computers choice
            computersInt = generator.nextInt(3) + 1;

            //Translate computers randomly generated number to our string using if statements
            if (computersInt == 1)
                computerPlay = "r";
            else if (computersInt == 2)
                computerPlay = "p";
            else if (computersInt == 3)
                computerPlay = "s";

            //End Game option
            if (playersPlay.equalsIgnoreCase("x")) {
                System.out.println("Thank you for playing!");
                System.exit(0);
            }

            //Send outcome messages
            if (playersPlay.equals(computerPlay)) {
                if (playersPlay.equalsIgnoreCase("r")) {
                    System.out.println("Draw!\nComputer Choice: rock\tPlayer choice: rock");
                } else if (playersPlay.equalsIgnoreCase("p")) {
                    System.out.println("Draw!\nComputer Choice: paper\tPlayer choice: paper");
                } else if (playersPlay.equalsIgnoreCase("s")) {
                    System.out.println("Draw!\nComputer Choice: scissors\tPlayer choice: scissors");
                }
            }
            //User chooses rock
            if (playersPlay.equalsIgnoreCase("r")) {
                if (computerPlay.equalsIgnoreCase("p")) {
                    System.out.println("You lose!\nComputer Choice: paper\tPlayer choice: rock");
                    //Adding score to the computer (losses)
                    computerWins += 1;
                } else if (computerPlay.equalsIgnoreCase("s")) {
                    System.out.println("You win!\nComputer Choice: scissors\tPlayer choice: rock");
                    //Adding score to the player (wins)
                    playerWins += 1;
                }
                //Sending a message containing a line for separation, the scoreboard and the players new choice message.
                System.out.println("**********************************************\nWins: " + playerWins + " Losses: " + computerWins + "\nPlayers Choice:");
            }
            //User chooses paper
            else if (playersPlay.equalsIgnoreCase("P")) {
                if (computerPlay.equalsIgnoreCase("r")) {
                    System.out.println("You win!\nComputer Choice: rock\tPlayer choice: paper");
                    playerWins += 1;
                } else if (computerPlay.equalsIgnoreCase("s")) {
                    System.out.println("You lose!\nComputer Choice: scissors\tPlayer choice: paper");
                    computerWins += 1;
                }
                System.out.println("**********************************************\nWins: " + playerWins + " Losses: " + computerWins + "\nPlayers Choice:");
            } else {
                //User chooses scissors
                if (playersPlay.equalsIgnoreCase("s")) {
                    if (computerPlay.equalsIgnoreCase("r")) {
                        System.out.println("You lose!\nComputer Choice: rock\tPlayer choice: scissors");
                        computerWins += 1;
                    } else if (computerPlay.equalsIgnoreCase("p")) {
                        System.out.println("You win!\nComputer Choice: paper\tPlayer choice: scissors");
                        playerWins += 1;
                    }
                    System.out.println("**********************************************\nWins: " + playerWins + " Losses: " + computerWins + "\nPlayers Choice:");
                } else {
                    //Invalid selection message
                    System.out.println("Invalid selection please try again.");
                    //Send the startup message so they can still play
                    System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");
                }
            }
        }
    }
}