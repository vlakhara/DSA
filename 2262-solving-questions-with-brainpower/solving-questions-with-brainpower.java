class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];

        for(int i = n - 1; i >= 0; i--) {
            long point = questions[i][0];
            long brainPower = questions[i][1];

            int next = (int) i + 1 + (int) brainPower;

            long choose = point + (next < n ? dp[next] : 0); 
            long skip = (i + 1) < n ? dp[i + 1] : 0;

            dp[i] = Math.max(choose, skip);
        }

        return dp[0];
    }

    public static long backtrack(int i, int n, long[] dp, int[][] questions) {
        if(i >= n) {
            return 0;
        }

        if(dp[i] != 0) {
            return dp[i];
        }

        int point = questions[i][0];
        int brainPower = questions[i][1];

        dp[i] = (long) Math.max(backtrack(i + 1, n, dp, questions), point + backtrack(i + 1 + brainPower, n, dp, questions));

        return dp[i];
    }
}