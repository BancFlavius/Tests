package Arrays;

public class T64 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i]=(int)(Math.random() * 100 )+1 ;
            System.out.println("Slot " + i +" contains a " + array[i]);
        }
    }
}
