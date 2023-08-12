// Write a program to print the factorial of a number by defining a method named 'Factorial'.
import java.util.Scanner;
public class AssignmentQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get it's factorial: ");
        int userInput = sc.nextInt();
        System.out.println("Factorial of " + userInput + " is: " + getFactorial(userInput));
    }

    static int getFactorial(int userInput) {
        int fac = 1;
        for(int i=1; i<=userInput; i++) {
            fac *= i;
        }
        return fac;
    }
}
