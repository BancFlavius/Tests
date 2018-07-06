package Arrays;

import java.util.Random;

public class T71 {
    public static void main(String[] args) {
        Random gen = new Random();
        int[] array = new int[10];
        int largest = 0;
        int slot = 0;
        System.out.print("Array: ");
        for(int i = 0; i < array.length;i++){
            array[i]=gen.nextInt(100)+1;
            if(largest < array[i]){
                largest = array[i];
                slot = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\r\n");
        System.out.println("The largest value is " + largest);
        System.out.println("It is in slot " + slot);
    }
}
