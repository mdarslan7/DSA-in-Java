//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;
public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = maxNumber(a, b, c);
        System.out.println("The maximum number is: " + max);
        int min = minNumber(a, b, c);
        System.out.println("The minimum number is: " + min);
    }

    static int maxNumber(int a, int b, int c) {
        if(a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;
    }

    static int minNumber(int a, int b, int c) {
        if(a<b && a<c)
            return a;
        else if (b<a && b<c)
            return b;
        else
            return c;
    }
}
