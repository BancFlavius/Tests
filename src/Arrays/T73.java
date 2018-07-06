package Arrays;

import java.util.Scanner;

public class T73 {
    public static void main(String[] args) {
        String[] arr1 = {"Mihai", "George", "Gabi", "Ion", "Marius"};
        double[] arr2 = {76.2, 67.9, 99.2, 84.5, 82.7};
        int[] arr3 = {1321, 3216, 1532, 1231, 2434};

        System.out.print("Values: \n\t");
        for(int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
            System.out.print(arr2[i]+" ");
            System.out.print(arr3[i]+"\n\t\t");
        }

        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("ID number to find: ");
        int number = input.nextInt();

        System.out.println("");
        for(int i = 0 ; i<arr1.length;i++){
            if(arr3[i] == number){
                System.out.print("Found in slot "+i+"\n\t\t");
                System.out.print("Name: "+arr1[i]+"\n\t\t");
                System.out.print("Average: "+arr2[i]+"\n\t\t");
                System.out.print("ID: "+arr3[i]);
            }
        }
    }
}

