import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // Create a main() method
    public static void main(String[] args) {


        int randomNumber = new Random().nextInt(100) + 1;
        // Use the following code to create a random number from 1 to 100:
        // Note: you may have to import the Random class
        // int randomNumber = new Random().nextInt(100) + 1;

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        int guessAttempts = 6;
        // Create a variable to hold the number of guess attempts, example
        // int guessAttempts = 6;


        while (guessAttempts > 0) {
            System.out.println("Enter your guess between 1 and 100");
            int guessAgain = sc.nextInt();
            if (guessAttempts == guessAgain) {
                System.out.println("You guess Correctly");
                System.exit(0);
            } else {
                if (guessAgain < randomNumber) {
                    System.out.println("You gussed too low");
                    guessAttempts -= 1;
                } else {
                    System.out.println("You guessed it too high");
                    guessAttempts -= 1;
                }
                System.out.println(" You have lost and reveal the random number!");

                // While the user has mre than 0 guess attempts...
                // Ask the user for a number between 1 and 100
                // If the user's number matches the random number tell the user they guessed correctly!
                // Stop the program using:
                // System.exit(0);
                // Otherwise, if the user's number is lower than the random number,
                // tell them they guessed too low

                // Decrease the number of attempts by 1
                // Otherwise, tell the user they guessed too high

                // Decrease the number of attempts by 1


                // Outside the loop, tell the user they have lost and reveal the random number!



                /*
                 * Feel free to add any additional rules :)
                 */
            }
        }
    }}