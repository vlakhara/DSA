class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return nums[0];
        } else if(n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp1 = new int[n + 1];
        int[] dp2 = new int[n + 1];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int m1 = Math.max(nums[0] + find(2, nums, n - 1, dp1), nums[1] + find(3, nums, n - 1, dp1));
        int m2 = Math.max(nums[1] + find(3, nums, n, dp2), nums[2] + find(4, nums, n, dp2));

        return Math.max(m1, m2);
    }

    int find( int i, int[] nums, int n, int[] dp) {
        if (i > n - 1) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        return dp[i] = Math.max(nums[i] + find(i + 2, nums, n, dp), find(i + 1, nums, n, dp));
    }
}