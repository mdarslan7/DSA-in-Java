import java.util.Arrays;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        //Take Input
        for(int i=0; i<arr.length; i++) {
            System.out.println("Enter the element - " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing using for-loop");
        for(int i=0; i<arr.length; i++) {
            System.out.println("The element: " + (i+1) + " is: " + arr[i]);
        }

        System.out.println("Printing using enhanced-for/for-each loop");
        for(int num: arr) {
            System.out.println(num);
        }

        System.out.println("Printing using toString() function");
        System.out.println(Arrays.toString(arr));
    }
}
