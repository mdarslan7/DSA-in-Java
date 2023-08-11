// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class AssignmentQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to get their sum calculated using a function: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum calculated from inside the function is: " + sum(a, b));
    }

    static int sum(int a, int b) {
        return a+b;
    }
}
