import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BigInteger A = BigInteger.valueOf(1);
        for(int i=2; i<=num; i++) {
            A = A.multiply(BigInteger.valueOf(i));
        }
        System.out.println(A);
    }
}
