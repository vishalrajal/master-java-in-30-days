import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    static FileReader file;

    static void readFile() throws IOException {
        file = new FileReader("data.txt");
    }

    public static void main(String[] args) {

        try (FileReader file = new FileReader("data.txt")) {
            System.out.println("File opened successfully");
        }

        catch(IOException e) {
            System.out.println("File not found");
        }

    }
}