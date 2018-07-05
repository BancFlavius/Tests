package FileInputAndOutput;

import java.io.*;
import java.util.Scanner;

public class T58 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type the name of the file: ");
        String file = input.next();
        FileReader fr = new FileReader(file);
        read(fr);

    }
    static void read(FileReader fr) throws IOException {
        System.out.println("");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
