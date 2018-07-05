package FileInputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class T60 {
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

        String line = br.readLine();
        char c[] = line.toCharArray();
        int temp=0;
        for(int i = 0; i<c.length;i++ ) {
            temp++;
            if(temp == 3) {
                temp = 0;
                System.out.print(c[i]);
            }
        }
        br.close();
    }
}
