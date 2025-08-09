import java.util.Random;
import java.util.Scanner;
public class RandomString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int size = sc.nextInt();
        StringBuffer sb = new StringBuffer(size);

        for(int i=0; i<size; i++) {
            int random = 97 + (int) (26 * rand.nextFloat());
            sb.append((char) random);
        }

        System.out.println(sb.toString());
    }
}