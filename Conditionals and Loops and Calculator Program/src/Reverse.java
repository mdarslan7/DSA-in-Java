import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 127;
        int temp;
        int rev = 0;
        while(n>0) {
            temp = n % 10;
            rev = rev*10 + temp;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
