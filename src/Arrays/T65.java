package Arrays;

import java.util.Random;

public class T65 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random gen = new Random();
        int temp = 0;
        for(int i = 0; i<array.length;i++){
            array[i] = gen.nextInt(90)+10;
            System.out.print(array[i] + " ");
            temp++;
            if(temp == 20){
                System.out.println("");
                temp = 0;
            }
        }
    }
}
