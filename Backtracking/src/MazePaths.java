public class MazePaths {
    public static void main(String[] args) {
//        mazePaths("", 3, 3);
//        mazePathsDiagonal("", 3, 3);
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazeWithObstruction("", maze, 0, 0);
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

    static void mazePathsDiagonal(String p, int row, int col) {
        if(row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if((row > 1) && (col > 1))
            mazePathsDiagonal(p + "D", row-1, col-1);

        if(row > 1)
            mazePathsDiagonal(p + "V", row-1, col);

        if(col > 1)
            mazePathsDiagonal(p + "H", row, col-1);

    }

    static void mazeWithObstruction(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[row][col])
            return;

        if(row < maze.length - 1)
            mazeWithObstruction(p + "D", maze, row+1, col);

        if(col < maze[0].length - 1)
            mazeWithObstruction(p + "R", maze, row, col+1);

    }
}
