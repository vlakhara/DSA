class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        if(nums.length <= 1) {
            return nums[0];
        }
        
        return Math.max(nums[0] + find(0, 2, nums, n, dp), nums[1] + find(0, 3, nums, n, dp));
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