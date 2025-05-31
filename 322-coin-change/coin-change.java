class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }

        int res = exchange(coins, amount, n, dp);
        return res == Integer.MAX_VALUE - 1 ? -1 : res;
    }

    int exchange(int[] coins, int amount, int n, int[][] dp) {
        if (amount == 0)
            return 0;
        if (n == 0)
            return Integer.MAX_VALUE - 1;

        if (dp[n][amount] != -1) {
            return dp[n][amount];
        }

        if (coins[n - 1] <= amount) {
            dp[n][amount] = Math.min(1 + exchange(coins, amount - coins[n - 1], n, dp),
                    exchange(coins, amount, n - 1, dp));
        } else {
            dp[n][amount] = exchange(coins, amount, n - 1, dp);
        }

        return dp[n][amount];
    }
}