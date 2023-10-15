import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        change(arr);

        //Through change() function, we are able to change the value of arr directly. Although we say that
        //there is only call by value in java, we are still able to do say because the copy of arr that is passed
        //in the function change() points to the same object in heap.

        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] arr2) {
        arr2[0] = 99;
    }
}
