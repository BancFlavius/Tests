package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int ace = 1 + r.nextInt(3);

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.\n");
        System.out.print("Which one is the ace?\n" +
                "\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3\n" +
                "\n" +
                "> ");
        int guess = input.nextInt();

        if ( guess == ace )
            System.out.println("You nailed it");
        else
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + ace + ".");

        if ( ace == 1 ) {
            System.out.println("\n" +
                    "\tAA  ##  ##\n" +
                    "\tAA  ##  ##\n" +
                    "\t1   2   3\n" );
        } else if ( ace == 2 ) {
            System.out.println("\n" +
                    "\t##  AA  ##\n" +
                    "\t##  AA  ##\n" +
                    "\t1   2   3\n" );
        } else if ( ace == 3 ) {
            System.out.println("\n" +
                    "\t##  ##  AA\n" +
                    "\t##  ##  AA\n" +
                    "\t1   2   3\n" );
        }


    }
}
