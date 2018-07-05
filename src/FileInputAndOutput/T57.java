package FileInputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T57 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("3nums.txt");
        read(fr);

    }
    static void read(FileReader fr) throws IOException {
        System.out.println("Reading numbers from file 3nums.txt");
        System.out.println("");
        BufferedReader br = new BufferedReader(fr);

        String line;
        int sum = 0;
        while ((line = br.readLine()) != null) {
            sum += Integer.parseInt(line);
            System.out.print(line+ " ");
        }
        System.out.print(" = " + sum);
        br.close();
    }
}
