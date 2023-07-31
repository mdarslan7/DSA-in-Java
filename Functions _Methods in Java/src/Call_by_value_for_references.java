import java.util.Arrays;

public class Call_by_value_for_references {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray(int[] nums) {
        nums[0] = 97;
    }
}