// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;
public class AssignmentQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check eligibility for voting: ");
        int userInput = sc.nextInt();
        boolean isEligible = canVote(userInput);
        if(isEligible)
            System.out.println("Eligible to Vote!");
        else
            System.out.println("Not Eligible to Vote!");
    }

    static boolean canVote(int userInput) {
        return userInput >= 18;
    }
}
