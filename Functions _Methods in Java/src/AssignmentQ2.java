// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;
public class AssignmentQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd: ");
        int userInput = sc.nextInt();
        boolean evenOrOdd = evenOdd(userInput);
        if(evenOrOdd)
            System.out.println("Even Number!");
        else
            System.out.println("Odd Number!");
    }

    static boolean evenOdd(int userInput) {
        return userInput % 2 == 0;
    }
}
