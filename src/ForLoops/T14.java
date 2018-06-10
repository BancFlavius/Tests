package ForLoops;

import java.util.Scanner;

public class T14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to: ");
        int to = input.nextInt();
        System.out.print("Count from: ");
        int from = input.nextInt();
        System.out.print("Count by : ");
        int by = input.nextInt();

        for(int i = from; i <= to; i+= by){
            System.out.print(i +" ");
        }
    }
}
