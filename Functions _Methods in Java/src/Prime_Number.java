import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int userInput = sc.nextInt();
        System.out.println(isPrimeNumber(userInput));
    }

    static String isPrimeNumber(int num) {
        int c = 2;
        while(c * c <= num) {
            if (num % c == 0)
                return "Not a Prime Number";
            else
                c++;
        }
        return "It's a Prime Number";
    }
}
