package FileInputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T56 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("name.txt");
        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine();
        System.out.println("With my magic power I can tell that your name is " + str + ".");
        br.close();
    }
}
