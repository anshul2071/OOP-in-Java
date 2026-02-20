import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        String fileName = "textData.txt";

        try {
            // 1. Write text to a file using FileWriter
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, world!\n");
            writer.write("This is a character stream example.\n");
            writer.write("Unicode test: 你好, مرحبا, Bonjour!"); // Chinese, Arabic, French
            writer.close();  // close the writer to save the data
            System.out.println("Text written to file successfully.");

            // 2. Read text from the file using FileReader
            FileReader reader = new FileReader(fileName);
            int character;
            System.out.println("\nReading text from file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // convert int to char
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
