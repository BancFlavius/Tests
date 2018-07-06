package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T68 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random gen = new Random();
        for(int i = 0 ; i < array.length ; i++){
            array[i] = gen.nextInt(50)+1;
        }
        System.out.println(Arrays.toString(array));
        Scanner input = new Scanner(System.in);
        System.out.print("Value to find: ");
        int value = input.nextInt();
        System.out.println();

        int found=0;
        for(int i = 0; i < array.length;i++){
            if(array[i] == value){
                found++;
            }
        }
        System.out.println(value + " was found " + found + " times.");
    }
}
