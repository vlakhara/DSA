class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int ans = 0;

        for(int i = 0; i < n - 1; i++) {

            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);

            ans += Math.abs(c1 - c2);
        }

        return ans;
    }
}