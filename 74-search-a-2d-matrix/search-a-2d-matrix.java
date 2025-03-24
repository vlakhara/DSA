class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int start = 0;
        int end = colLength - 1;
        int row = 0;

        while(row < rowLength) {

            if(start > end || end >= colLength) {
                row++;
                start = 0;
                end = colLength - 1;
            }

            if(row >= rowLength) {
                return false;
            } 

            int mid = start + (end - start) / 2;

            if(matrix[row][mid] == target) {
                return true;
            } else if(matrix[row][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;

    }
}

/**

     0   1   2   3

0    1   3   5   7

1   10  11  16  20

2   23  30  34  60


 */