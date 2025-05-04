class Solution {
    public int rob(int[] nums) {

        int n = nums.length;


        if(nums.length <= 1) {
            return nums[0];
        }

        int[] dp = new int[n];

        // Arrays.fill(dp, -1);

        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);

        for(int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
        
        // return Math.max(nums[0] + find(0, 2, nums, n, dp), nums[1] + find(0, 3, nums, n, dp));
    }

    public static int find(int money, int i, int[] arr, int n, int[] dp) {
        if(i > n - 1) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        dp[i] = Math.max(arr[i] + find(money, i + 2, arr, n, dp), find(money, i + 1, arr, n, dp));

        return dp[i];
    }
}