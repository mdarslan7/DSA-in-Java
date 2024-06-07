import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 1};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    //Kunal's approach, with a single loop
    static void sort(int[] arr) {
        int n = arr.length;
        int i = 0;

        while(i < n) {
            int correctIndex = arr[i] - 1;

            if(arr[correctIndex] != arr[i]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }

    //My first thought approach, O(n) but still can be improved
    static void sortNotEfficient(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int value = i + 1;

            while(arr[i] != value) {
                int index = arr[i] - 1;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}