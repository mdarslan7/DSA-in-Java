package sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int low, int hi) {
        if(low >= hi)
            return;

        int s = low;
        int e = hi;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s <= e) {
            //won't sort if already sorted
            while(arr[s] < pivot)
                s++;
            while(arr[e] > pivot)
                e--;

            //swap
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // after pivot is at right position
        quick(arr, low, e);
        quick(arr, s, hi);
    }
}
