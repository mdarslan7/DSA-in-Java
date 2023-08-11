// Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class AssignmentQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to get their product: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product is: " + getProduct(a, b));
    }

    static int getProduct(int a, int b) {
        return a*b;
    }
}
