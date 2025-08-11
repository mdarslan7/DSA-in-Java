import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        try(InputStreamReader obj = new InputStreamReader(System.in)) {
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