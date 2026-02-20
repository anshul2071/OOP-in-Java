
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    

    public static void main(String[] args) {
          String [] names= {"John", "David", "Nate"};

        try {      
              BufferedWriter writer = new BufferedWriter(new FileWriter("./filelocation/output.txt"));
              writer.write("Hello i am writer");
           

              for(String name: names ) {
                writer.write("\n" + name);
              } 
              writer.close();
            
            }
            catch(IOException e) {
                e.printStackTrace();
            }



            try {      
                 BufferedReader reader = new BufferedReader(new FileReader("./filelocation/output.txt"));
                 String line;
                 while((line = reader.readLine()) != null) {
                    System.err.println(line);
                 }
              reader.read();
              reader.close();
              System.out.println(reader.readLine());
              reader.close();
            }
              catch(IOException e) {
                  e.printStackTrace();
              }
            
    }
}
