import java.util.Scanner;

public class AssignmentQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome: ");
        int userInput = sc.nextInt();
        boolean answer = isPalindrome(userInput);
        if(answer)
            System.out.println("It's Palindrome!");
        else
            System.out.println("It's not Palindrome!");
    }

    static boolean isPalindrome(int userInput) {
        int num = userInput;
        int n, rev=0;
        while(num > 0) {
            n = num % 10;
            rev = (rev*10) + n;
            num /= 10;
        }
        return userInput == rev;
    }
}
