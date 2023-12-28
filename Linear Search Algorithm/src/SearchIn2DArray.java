import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 53, -2, 89},
                {65, 32, 88},
                {12, 45, 90, 21}
        };
        int target = 53;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                if(arr[row][col] == target)
                    return new int[] {row, col};
            }
        }

        return new int[] {-1, -1};
    }
}
