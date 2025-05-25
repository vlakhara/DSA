class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int total = 0;

        for(int i : nums) {
            total += i;
        }

        if(total < target || (total + target) < 0 || ((total + target) % 2 != 0)) {
            return 0;
        }

        int sum = (total + target) / 2;

        int[][] dp = new int[n + 1][sum + 1];

        for(int i = 0; i <= sum; i++) {
            dp[0][i] = 0;
        }

        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= sum; j++) {
                if(nums[i - 1] == 0) {
                    dp[i][j] = 2 * dp[i - 1][j];
                } else if(nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }


    /**
    

    s1 - s2 = target

    s1 + s2 = total

    s1 - target = s2

    s1 + s1 - target = total

    2s1 = target + total

    s1 = (target + total) / 2
    
     */
}