import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 11;

        int r = 0;
        int c = matrix[0].length - 1;

        while(r <= c) {
            if(matrix[r][c] == target) {
                System.out.println(Arrays.toString(new int[]{r, c}));
                break;
            }

            if(matrix[r][c] > target)
                c--;
            if(matrix[r][c] < target)
                r++;
        }
    }
}