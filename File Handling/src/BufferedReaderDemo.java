import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        //byte to char stream and then reading that char stream
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("You typed: " + br.readLine());
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }
        try(BufferedReader br = new BufferedReader(new FileReader("src/notes.txt"))) {
            while(br.ready()) {
                System.out.println(br.readLine());
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}