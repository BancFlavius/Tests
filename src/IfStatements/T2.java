package IfStatements;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {

        int guessedRgiht = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Are you ready for a quiz? ");
        String quiz = input.next();
        System.out.println("Alright, here we go.");
        System.out.println("");
        System.out.println("Question 1 - What is the capital of Alaska?");
        System.out.println("       1) Melbourne");
        System.out.println("       2) Anchorage");
        System.out.println("       3) Juneau");
        System.out.print("> ");
        int question1 = input.nextInt();

        if(question1 == 3 ) {
            System.out.println("That's right.");
            guessedRgiht++;
        } else {
            System.out.println("WRONG!");
        }

        System.out.println("");
        System.out.println("Question 2 - Can you store the value \"cat\" in a variable of type int?");
        System.out.println("       1) yes");
        System.out.println("       2) no");
        System.out.print("> ");
        int question2 = input.nextInt();

        if(question2 == 2 ) {
            System.out.println("That's right.");
            guessedRgiht++;
        } else {
            System.out.println("WRONG!");
        }

        System.out.println("");
        System.out.println("Question 3 - What is the result of 9+6/3?");
        System.out.println("       1) 12");
        System.out.println("       2) 7");
        System.out.println("       3) 11");
        System.out.print("> ");
        int question3 = input.nextInt();

        if(question3 == 3 ) {
            System.out.println("That's right.");
            guessedRgiht++;
        } else {
            System.out.println("WRONG!");
        }

        System.out.println("\n"+
                "\n"+
                "Overall, you got "+ guessedRgiht +" out of 3 correct.\n" +
                "Thanks for playing!");

    }
}
