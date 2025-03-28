package sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int r, int c) {
        if(r == 0)
            return;             // at last when we shall reach here, all calls shall return, emptying the stack one by one

        if(r > c) {
            if(arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            bubble(arr, r, c + 1);
        }

        else {
            bubble(arr, r - 1, 0);
        }
    }
}
