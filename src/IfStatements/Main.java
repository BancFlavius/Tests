package IfStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your current weight: ");
        double weight = input.nextDouble();

        System.out.println("I have information for the following planets:  ");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune");
        System.out.println("");
        System.out.print("Which planet would you like to visit? ");

        int visit = input.nextInt();

        switch (visit){
            case 1:
                System.out.println(" Your weight would be "+ (weight * 0.78) +" pounds on that planet."); break;
            case 2:
                System.out.println(" Your weight would be "+ (weight * 0.39) +" pounds on that planet."); break;
            case 3:
                System.out.println(" Your weight would be "+ (weight * 2.65) +" pounds on that planet."); break;
            case 4:
                System.out.println(" Your weight would be "+ (weight * 	1.17) +" pounds on that planet."); break;
            case 5:
                System.out.println(" Your weight would be "+ (weight * 1.05) +" pounds on that planet."); break;
            case 6:
                System.out.println(" Your weight would be "+ (weight * 1.23) +" pounds on that planet."); break;
            default:
                System.out.println("NOT A VALID NUMBER. PLEASE PICK A NUMBER THAT CORRESPONDS TO A PLANET.");
        }

    }
}
