package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int randomNr = 1 + r.nextInt(10);

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        int guess = input.nextInt();

        if( guess == randomNr )
            System.out.println("That's right! My secret number was " + randomNr + "!");
        else
            System.out.println("Sorry, but I was really thinking of " + randomNr + ".");

    }
}
