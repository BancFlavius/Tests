package IfStatements;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println("");
        System.out.println("Question 1 - Is it animal, vegetable or mineral?");
        System.out.print("> ");
        String question1 = input.next();

        System.out.println("");
        System.out.println("Question 2 - is it bigger than a breadbox?");
        System.out.print("> ");
        String question2 = input.next();
        System.out.println("");

        if( ( question1.equals("animal")) && ( question2.equals("yes") )){
            System.out.println("You're thinking of a moose!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        } else if ( ( question1.equals("animal")) && ( question2.equals("no") )) {
            System.out.println("You're thinking of a squirrel!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        } else if ( ( question1.equals("vegetable")) && ( question2.equals("yes") )) {
            System.out.println("You're thinking of a watermelon!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        } else if ( ( question1.equals("vegetable")) && ( question2.equals("no") )) {
            System.out.println("You're thinking of a squirrel!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        } else if ( ( question1.equals("mineral")) && ( question2.equals("yes") )) {
            System.out.println("You're thinking of a Camaro!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        } else if ( ( question1.equals("mineral")) && ( question2.equals("no") )) {
            System.out.println("You're thinking of a paper clip!\n" +
                    "I would ask you if I'm right, but I don't actually care.");
        } else {
            System.out.println("ERROR");
        }
    }
}
