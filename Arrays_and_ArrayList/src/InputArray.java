import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        //Take Input
        for(int i=0; i<arr.length; i++) {
            System.out.println("Enter the element: " + (i+1));
            arr[i] = sc.nextInt();
        }

        //Printing
        for(int i=0; i<arr.length; i++) {
            System.out.println("The element: " + (i+1) + " is: " + arr[i]);
        }
    }
}
