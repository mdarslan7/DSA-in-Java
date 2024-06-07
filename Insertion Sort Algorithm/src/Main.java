import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        //outer loop, i shall move from 0 to n-2 because j = i+1
        for(int i=0; i<n-1; i++) {
            //inner loop, j shall move from i+1 and decrement to sort the left side
            for(int j=i+1; j>0; j--) {
                //swap if element is smaller than previous element
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    //else means left side is already sorted hence break
                    break;
                }
            }
        }
    }
}