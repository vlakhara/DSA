class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int left = 0;
        int right = rowLength * colLength - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / colLength][mid % colLength]; 

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

/**
 * 
 * 0 1 2 3
 * 
 * 0 1 3 5 7
 * 
 * 1 10 11 16 20
 * 
 * 2 23 30 34 60
 * 
 * 
 */