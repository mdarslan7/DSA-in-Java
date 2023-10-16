import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

//        Input
        for(int row=0; row< arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

//        Output using nested loop
//        for(int row=0; row<arr.length; row++) {
//            for(int col=0; col<arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        Output using toString()
//        for(int row=0; row< arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        Output using enhanced for loop
        for(int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
