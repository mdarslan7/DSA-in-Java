import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Use the calculator as per instructions, enter x or X in instead of any operation to terminate the program.");
        while(true) {
            System.out.println("Enter operation you want to perform: ");
            char o = sc.next().trim().charAt(0);
            if (o == '+' || o == '-' || o == '*' || o == '/' || o == '%') {
                System.out.println("Enter two numbers for the operation: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int ans = 0;
                if (o == '+') {
                    ans = num1 + num2;
                }
                if (o == '-') {
                    ans = num1 - num2;
                }
                if (o == '*') {
                    ans = num1 * num2;
                }
                if (o == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("Can't divide by zero");
                    }
                }
                if (o == '%') {
                    ans = num1 % num2;
                }
                System.out.println("Answer is: " + ans);
            }
            else if (o == 'x' || o == 'X') {
                break;
            }
            else {
                System.out.println("Invalid operation");
            }
        }
    }
}
