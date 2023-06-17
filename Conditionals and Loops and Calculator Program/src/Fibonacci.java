import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci number you want");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 3;
        while(count<=n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
