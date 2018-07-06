package Arrays;

import java.util.Arrays;

public class T66 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[array.length];
        for(int i = 0; i < array.length; i++){
            array[i]=(int)(Math.random() * 100 )+1 ;
            array2[i]=array[i];
            if(i==array.length-1){
                array2[i]=-7;
            }
        }
        System.out.println("First array "+Arrays.toString(array));
        System.out.println("Second array "+ Arrays.toString(array2));
    }
}
