class Solution {
    public int scoreOfString(String s) {
        int l = s.length();
        int ans = 0;
        while(l-- > 1) {
            ans += Math.abs(s.charAt(l) - s.charAt(l - 1));
        }

        return ans;
    }
}