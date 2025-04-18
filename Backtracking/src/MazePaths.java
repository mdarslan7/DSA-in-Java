public class MazePaths {
    public static void main(String[] args) {
        mazePaths("", 3, 3);
    }

    static void mazePaths(String p, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if(row > 1)
            mazePaths(p + "D", row-1, col);

        if(col > 1)
            mazePaths(p + "R", row, col-1);

    }
}
