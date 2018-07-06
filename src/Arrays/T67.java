package Arrays;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class T67 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Filename: ");
        String filename = input.nextLine();

        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+"\r\n");

        int[] array = new int[5];

        System.out.println("");
        System.out.println("Here are your random grades, I hope you pass.");

        for(int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*100)+1;
            bw.write(array[i]+" ");
            System.out.println("Grade " + (i+1) + ": "+array[i]);
        }

        System.out.println("");
        System.out.println("Data saved to \"" + filename + "\"");
        bw.close();
    }
}
