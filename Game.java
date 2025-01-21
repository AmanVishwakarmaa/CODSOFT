import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean replay = true;
        int totalScore = 0;

        while (replay) {
            int LowestNumber = 1;
            int HighestNumber = 100;
            int numberToGuess = random.nextInt(HighestNumber - LowestNumber + 1) + LowestNumber;
            int remainingAttempts = 5;
            boolean correctAssumption = false;

            System.out.println("\nGuess a  random number between " + LowestNumber + " and " + HighestNumber + " has been generated.");
            System.out.println("You have " + remainingAttempts + " attempts to guess the number.");

            while (remainingAttempts > 0) {
                System.out.print("Enter your guess number here:- ");
                int gussedNumber;

                if (in.hasNextInt()) {
                    gussedNumber = in.nextInt();
                } else {
                    System.out.println("Wrong number. Please enter a new number.");
                    in.next(); 
                    continue;
                }

                if (gussedNumber == numberToGuess) {
                    System.out.println("You Won! The Guessed Number is correct!");
                    correctAssumption = true;
                    totalScore += remainingAttempts; 
                    break;
                } else if (gussedNumber < numberToGuess) {
                    System.out.println("Very low!");
                } else {
                    System.out.println("Very high!");
                }

                remainingAttempts--;
                System.out.println("Remaining attempts:- " + remainingAttempts);
            }

            if (!correctAssumption) {
                System.out.println("You're out of attempts. The correct number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = in.next().toLowerCase();
            replay = response.equals("yes");

            if (!replay) {
                System.out.println("\nYour total score is: " + totalScore);
            }
        }

        in.close();
    }
}
