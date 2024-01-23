import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 1 },
                { 2, 2 } };

        int[][] mat2 = { { 1, 1 },
                { 2, 2 } };

        int r1 = 2;
        int c1 = 2;
        int r2 = 2;
        int c2 = 2;
        int[][] result = new int[2][2];

        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                result[i][j] = 0;
                for(int k=0; k<r2; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
