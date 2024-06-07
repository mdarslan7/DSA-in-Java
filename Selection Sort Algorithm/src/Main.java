import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        //outer loop
        for(int i=0; i<n; i++) {
            //find the max element in the array and swap it with the last element
            int last = n - 1 - i;
            int max = max(arr, last);

            //swapping
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }

    static int max(int[] arr, int last) {
        int max = 0;
        for(int i=1; i <= last; i++) {
            if(arr[i] > arr[max])
                max = i;
        }

        return max;
    }
}