class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        for (int j = 1; j <= amount; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1;
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= amount; j++) {
        //         dp[i][j] = -1;
        //     }
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[n][amount];

        // int res = exchange(coins, amount, n, dp);
        // return res == Integer.MAX_VALUE - 1 ? -1 : res;
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