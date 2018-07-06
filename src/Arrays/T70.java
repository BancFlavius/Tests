package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T70 {
    public static void main(String[] args) {
        Random gen = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = gen.nextInt(50)+1;
        }
        System.out.println(Arrays.toString(array));
        Scanner input = new Scanner(System.in);
        System.out.print("Value to find: ");
        int value = input.nextInt();
        System.out.println("");

        boolean found = false;
        for(int i = 0; i < array.length;i++){
            if(value == array[i]){
                found = true;
                System.out.println(value + " is in slot "+i);

            }
        }
        if(found == false){
            System.out.println(value + " was not found.");
        }
    }
}
