public class Pattern17 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for(int row = 1; row <= 2*n - 1; row++) {
            int colsInRow = row > n ? 2*n - row : row;

            //for spaces
            for(int k = 1; k <= n - colsInRow; k++) {
                System.out.print(" ");
            }

            for(int j = colsInRow; j>=1; j--) {
                System.out.print(j);
            }

            for(int j = 2; j<=colsInRow; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
