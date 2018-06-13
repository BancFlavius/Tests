package Functions;

import java.util.Scanner;


public class T44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("What is your name? ");
        String name = input.next();
        System.out.println("");
        for(int i = 1; i<=5;i++){

            System.out.println(name);

            if(!name.equals("Flavius")){
                System.out.println(name);
            }
        }
    }
}
