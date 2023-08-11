// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class AssignmentQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100: ");
        float marks = sc.nextFloat();
        String grade = calculateGrade(marks);
        System.out.println("Your grade is: " + grade);
    }

    static String calculateGrade(float marks) {
        if (marks >= 91 && marks <=100)
            return "AA";
        if (marks >= 81 && marks <=90)
            return "AB";
        if (marks >= 71 && marks <=80)
            return "BB";
        if (marks >= 61 && marks <=70)
            return "BC";
        if (marks >= 51 && marks <=60)
            return "CD";
        if (marks >= 41 && marks <=50)
            return "DD";
        if (marks <= 40)
            return "Fail";
        else
            return "Invalid Input";
    }
}
