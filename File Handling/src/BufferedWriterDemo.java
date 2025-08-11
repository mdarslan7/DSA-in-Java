import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(BufferedWriter br = new BufferedWriter(new FileWriter("src/notes.txt"))) {
            br.write("I was replaced by BufferWriter with the help of FileWriter");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}