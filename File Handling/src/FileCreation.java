import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        try {
            File fo = new File("src/new-file.txt");
            fo.createNewFile();
            System.out.println(fo.getName());
//            fo.delete();

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}