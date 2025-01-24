class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] pre = new int[n];
        int[] post = new int[n];
        int max = Integer.MIN_VALUE;

        pre[0] = s.charAt(0) == '0' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + (s.charAt(i) == '0' ? 1 : 0);
        }

        post[n - 1] = s.charAt(n - 1) == '1' ? 1 : 0;
        for (int i = n - 2; i >= 0; i--) {
            post[i] = post[i + 1] + (s.charAt(i) == '1' ? 1 : 0);
        }

        
        for (int i = 0; i < n - 1; i++) { 
            int score = pre[i] + post[i + 1];
            max = Math.max(max, score);
        }

        return max;
    }

}

/*
 * 
 * 1 1 1 1 2
 * 4 3 2 1 1
 * 
 * 
 * 4 + 4 + 3 + 2 + 2 + 2
 * 
 */