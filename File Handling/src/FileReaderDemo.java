import java.io.IOException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader obj = new FileReader("src/notes.txt")) {
            System.out.println("Enter some letters: ");
            int letters = obj.read();
            while(obj.ready()) {
                System.out.println((char) letters);
                letters = obj.read();
            }
            obj.close();
            System.out.println();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
