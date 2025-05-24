class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int total = 0;

        for(int i = 0; i < n; i++) {
            total += nums[i];
        }

        if(total % 2 != 0) {
            return false;
        }

        int sum = total / 2;

        Boolean[][] t = new Boolean[n + 1][sum + 1];

        // for(int i = 0; i <= sum; i++) {
        //     t[0][i] = false;
        // }

        // for(int i = 0; i <= n; i++) {
        //     t[i][0] = true;
        // }

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= sum; j++) {
        //         if(nums[i - 1] <= j) {
        //             t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
        //         } else {
        //             t[i][j] = t[i - 1][j];
        //         }
        //     }
        // }

        // return t[n][sum];

        return findSubset(nums, sum, n - 1, t);
    }

    boolean findSubset(int[] arr, int sum, int n, Boolean[][] t) {
        if(sum == 0) {
            return true;
        }

        if(n == 0) {
            return arr[n] == sum;
        }

        if(t[n][sum] != null) {
            return t[n][sum];
        }

        if(arr[n] <= sum) {
            t[n][sum] = findSubset(arr, sum - arr[n], n - 1, t) || findSubset(arr, sum, n - 1, t);
        } else {
            t[n][sum] = findSubset(arr, sum, n - 1, t);
        }

        return t[n][sum];

    }
}