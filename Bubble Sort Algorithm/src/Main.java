import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        int n = arr.length;
        //outer loop
        for(int i = 0; i < n; i++) {
            swapped = false;
            //inner loop for comparisons
            for(int j = 1; j < n-i; j++) {
                //swapping when condition met
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            //if elements do not get swapped for a particular value of i, it means
            //that the array is now sorted hence we can exit the program
            if(!swapped) {
                break;
            }
        }
    }
}