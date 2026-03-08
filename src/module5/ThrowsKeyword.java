package module5;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.read();
    }

    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
