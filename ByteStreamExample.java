import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        String sourceFile = "./filelocation/source.dat";   // source file
        String destFile = "./filelocation/copy.dat";       // destination file

        try {
            // 1. Write some bytes to the source file
            FileOutputStream output = new FileOutputStream(sourceFile);
            String data = "../Downloads/Music/626316450_1657593448753965_6934071782578758984_n.jpg";
            output.write(data.getBytes());  // convert string to bytes
            output.close();
            System.out.println("Data written to " + sourceFile);

            // 2. Read bytes from the source file
            FileInputStream input = new FileInputStream(sourceFile);
            FileOutputStream outputCopy = new FileOutputStream(destFile);

            int byteData;
            while ((byteData = input.read()) != -1) {
                outputCopy.write(byteData);  // copy each byte to new file
            }

            input.close();
            outputCopy.close();
            System.out.println("Data copied to " + destFile + " using byte streams.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
