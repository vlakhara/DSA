class Solution {
    public int minOperations(int[][] grid, int x) {

        int m = grid.length, n = grid[0].length;
        int size = m * n;
        int[] arr = new int[size];

        int index = 0;
        for (int[] row : grid) {
            for (int num : row) {
                arr[index++] = num;
            }
        }

        Arrays.sort(arr);
        
        int base = arr[0];
        for (int num : arr) {
            if ((num - base) % x != 0) {
                return -1;
            }
        }

        int median = arr[size / 2];
        int operations = 0;

        for (int num : arr) {
            operations += Math.abs(num - median) / x;
        }

        return operations;
    }
}

// Check all reminders in grid
// Flat Grid into Array
// Prefix Sum - Suffix Sum