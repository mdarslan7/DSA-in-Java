import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        //for low-level, binary data. It's used for writing things like images, executable files, or encrypted data where you're dealing with the raw byte values themselves.
        try(OutputStreamWriter obj = new OutputStreamWriter(System.out)) {
            obj.write("hello");
            obj.write(12);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter obj = new FileWriter("src/notes.txt", true)) {
            obj.write(" This has been appended by FileWriter.");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}