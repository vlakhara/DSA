class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(minCost(cost, 0, dp), minCost(cost, 1, dp));
    }

    public static int minCost(int[] arr, int i, int[] dp) {
        if(i >= arr.length) {
            return 0;
        }

        if(dp[i] != -1) {
            return dp[i];
        }

        dp[i] = arr[i] + Math.min(minCost(arr, i + 1, dp), minCost(arr, i + 2, dp));

        return dp[i];
    }
}
