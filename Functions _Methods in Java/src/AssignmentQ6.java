// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;
public class AssignmentQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("The circumference of the circle is: " + calculateCircumference(radius));
        System.out.println("The area of the circle is: " + calculateArea(radius));
    }

    static double calculateCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

    static double calculateArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
