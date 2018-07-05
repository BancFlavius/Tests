package FileInputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class T61 {
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
        String letter;
        while((line = br.readLine()) != null) {
            char c[] = line.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' ){
                    letter = String.valueOf(Character.toUpperCase(c[i]));
                    System.out.print(letter);
                } else {
                    System.out.print(c[i]);
                }
            }
            System.out.println("");
        }
        br.close();
    }
}

