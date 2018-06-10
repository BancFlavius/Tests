package ForLoops;

import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to: ");
        int count = input.nextInt();
        int temp=1;

        for (int i = 1; i<=count;i++){
            System.out.print(i+" " );
            temp++;
            if(temp > 20) {
                System.out.println("\n");
                temp = 1;
            }

        }
    }
}
