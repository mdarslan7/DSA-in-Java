import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1},
                {2, 2}
        };

        int target = 0;

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