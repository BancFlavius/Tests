package Functions;

import java.util.Scanner;

public class T45 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int choice = input.nextInt();
        System.out.println("");

        for(int i = 1; i<=12; i++){
            System.out.println(choice+"x"+i+" = "+choice*i);
        }
    }
}
