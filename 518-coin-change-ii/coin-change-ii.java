class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }

        return ways(coins, amount, n, dp);
    }

    int ways(int[] coins, int amount, int n, int[][] dp) {
        if (amount == 0)
            return 1;
        if (n == 0)
            return 0;

        if (dp[n][amount] != -1) {
            return dp[n][amount];
        }

        if (coins[n - 1] <= amount) {
            dp[n][amount] = ways(coins, amount - coins[n - 1], n, dp) + ways(coins, amount, n - 1, dp);
        } else {
            dp[n][amount] = ways(coins, amount, n - 1, dp);
        }

        return dp[n][amount];
    }
}