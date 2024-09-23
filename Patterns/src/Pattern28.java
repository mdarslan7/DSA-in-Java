public class Pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern (int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            int totalSpaces = n - totalColsInRow;

            //for spaces
            for(int k=1; k<=totalSpaces; k++) {
                System.out.print(" ");
            }

            //for stars
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
