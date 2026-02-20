
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) throws IOException {
        FileReader  reader = null;
        FileWriter writer = null;


        try {
            reader = new FileReader("/filelocation/hello.txt");

             writer = new FileWriter("./filelocation/walker.txt");


int content;

while ((content = reader.read()) != -1) {
    writer.write((byte) content);
}

        } 
        
        catch (Exception e) {
            System.err.println(e);
        }
        finally {
            if(reader!= null) {
                reader.close();
            }

            if(writer!=null) {
                writer.close();
            }
        }

    
    }

}