package RandomNumbers;

import java.util.Random;

public class T9 {
    public static void main(String[] args) {
        System.out.println("HERE COMES THE DICE!");

        Random r = new Random();
        int rollNr1 = 1 + r.nextInt(6);
        int rollNr2 = 1 + r.nextInt(6);

        System.out.println("");
        System.out.println("Roll #1 : " + rollNr1);
        System.out.println("Roll #2 : " + rollNr2);
        System.out.println("The total is " + (rollNr1 + rollNr2));

        while ( rollNr1 != rollNr2) {
            rollNr1 = 1 + r.nextInt(6);
            rollNr2 = 1 + r.nextInt(6);

            System.out.println("");
            System.out.println("Roll #1 : " + rollNr1);
            System.out.println("Roll #2 : " + rollNr2);
            System.out.println("The total is " + (rollNr1 + rollNr2));
        }
    }
}
