public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int target = 3;
    }

    static int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[] {-1, -1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1)
            return binarySearch(matrix, 0, 0, matrix.length-1, target);

        //searching in the matrix, here eliminating rows but can also eliminate columns to reduce the search space
        //while loop condition needs to iterate till two rows are left
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //for condition, rCol ko decrement karke it should not be equal to rStart, should be less
        while(rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target)
                return new int[] {mid, cMid};
            if(matrix[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }

        //now dealing with the last two rows

        //if target is present in the middle column
        if(matrix[rStart][cMid] == target)
            return new int[] {rStart, cMid};

        if(matrix[rStart + 1][cMid] == target)
            return new int[] {rStart + 1, cMid};

        //now four cases:
        //searching in first half
        if(target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }

        //searching in second half
        //in right side
        if(target >= matrix[rStart][cMid + 1]) {

        }

        //searching in third half
        if(target <= matrix[rStart + 1][cMid - 1]) {

        }

        //searching in fourth half
        else {

        }
    }

    //to search in the rows when two rows are left at the end
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        int mid = colStart + (colEnd - colStart)/2;

        while(colStart <= colEnd) {
            if (matrix[row][mid] == target)
                return new int[] {row, mid};

            if (matrix[row][mid] < target)
                colStart = mid + 1;
            else
                colEnd = mid - 1;
        }

        return new int[] {-1, -1};
    }
}
