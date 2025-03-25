package arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        System.out.println(sortArray(arr, 0));
    }

    static boolean sortArray(int[] arr, int index) {
        if(index == arr.length - 1)
            return true;

        return (arr[index] < arr[index + 1]) && sortArray(arr, index + 1);
    }
}
