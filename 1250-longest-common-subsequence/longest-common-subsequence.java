class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        // for(int[] arr: dp) {
        //     Arrays.fill(arr, -1);
        // }

        for(int i = 0; i <= n1; i++) {
            dp[i][0] = 0;
        }

        for(int i = 0; i <= n2; i++) {
            dp[0][i] = 0;
        }

        for(int i = 1; i <= n1; i++) {
            for(int j = 1; j <= n2; j++) {
                char ch1 = text1.charAt(i - 1);
                char ch2 = text2.charAt(j - 1);
                if(ch1 == ch2) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n1][n2];
        // return lcs(text1, text2, n1, n2, dp);
    }

    // int lcs(String s1, String s2, int n1, int n2, int[][] dp) {
    //     if(n1 == 0 || n2 == 0) {
    //         return 0;
    //     }

    //     if(dp[n1][n2] != -1) {
    //         return dp[n1][n2];
    //     }

    //     char ch1 = s1.charAt(n1 - 1);
    //     char ch2 = s2.charAt(n2 - 1);

    //     if(ch1 == ch2) {
    //         dp[n1][n2] = 1 + lcs(s1, s2, n1 - 1, n2 - 1, dp);
    //     } else {
    //         dp[n1][n2] = Math.max(lcs(s1, s2, n1 - 1, n2, dp), lcs(s1, s2, n1, n2 - 1, dp));
    //     }

    //     return dp[n1][n2];
    // }
}