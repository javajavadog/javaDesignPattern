package decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt");
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("hi decorator");
        writer.newLine();
        writer.close();
    }

}
