//Assignment: first-java.md

import java.math.*;
import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
/*
        Q1 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's even or odd: ");
        int x = sc.nextInt();
        if (x % 2 == 0)
            System.out.println("It is an Even Number.");
        else
            System.out.println("It is an Odd Number");
*/

/*
        Q2 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you name: ");
        String x =  sc.nextLine();
        System.out.println("Hello " + x + ", Welcome to TechStart!");
*/

/*
        Q3 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter the Rate Per Annum: ");
        float r = sc.nextFloat();
        System.out.println("Enter the Time in Years: ");
        float t = sc.nextFloat();
        float simpleInterest = (p*r*t) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
*/

/*
        Q4 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float a = sc.nextInt();
        System.out.println("Enter another number: ");
        float b = sc.nextInt();
        System.out.println("Enter which operation you would like to perform: +, -, * or /");
        char o = sc.next().charAt(0);
        if(o == '+') {
            float sum = a+b;
            System.out.println("The Result is: " + sum);
        }
        if(o == '-') {
            float sub = a-b;
            System.out.println("The Result is: " + sub);
        }
        if(o == '*') {
            float mul = a*b;
            System.out.println("The Result is: " + mul);
        }
        if(o == '/') {
            float div = a/b;
            System.out.println("The Result is: " + div);
        }
*/

/*
        Q5 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        if(a > b)
            System.out.println(a + " is the largest number.");
        else if(b > a)
            System.out.println(b + " is the largest number.");
        else
            System.out.println("Both numbers are equal.");
*/

/*
        Q6 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount in Rupees: ");
        double rupees = sc.nextDouble();
        double usd = rupees * 0.012;
        System.out.println("Amount Entered in Rupees would be " + usd + "$ in USD.");
*/

/*
        Q7 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto which you want to print Fibonacci Series: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = a+b;
        System.out.println(a);
        System.out.println(b);
        int i=1;
        while(i <= num-2) {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
*/

/*
        Q8 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check if it's Palindrome: ");
        String x = sc.nextLine();x = x.toLowerCase();
        x = x.toLowerCase();
        int length = x.length();
        String reverse = "";
        for(int i = length-1; i >= 0; i--) {
            reverse += x.charAt(i);
        }
        if(reverse.equals(x))
            System.out.println("It's a Palindrome.");
        else
            System.out.println("It's not a Palindrome.");
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number greater than entered number: ");
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            int num = i;
            int temp, arm = 0;
            while(num > 0) {
                temp = num % 10;
                arm += Math.pow(temp, 3);
                num = num/10;
            }
            System.out.println(num + " is an Armstrong number between " + a + " and " + b);
        }
    }
}
