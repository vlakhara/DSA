class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        return backtrack(0, n, dp, questions);
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