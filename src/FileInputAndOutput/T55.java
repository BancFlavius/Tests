package FileInputAndOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class T55 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type your name: ");
        String name = input.next();
        System.out.print("Please type your score: ");
        String score = input.next();
        System.out.println("Data store in score.txt");


        FileWriter fw = new FileWriter("score.txt", true);
        fw.write("----\r\n");
        fw.write(name+"\r\n");
        fw.write(score+"\r\n");
        fw.write("----\r\n");
        fw.close();
    }
}
