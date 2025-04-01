class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl = 0;
        int tl = 0;

        if(s.length() == 0) {
            return true;
        }

        while(tl < t.length()) {
            if(s.charAt(sl) == t.charAt(tl)) {
                sl++;
                tl++;
            } else {
                tl++;
            }

            if(sl >= s.length()) {
                break;
            }
        }

        return sl == s.length();
    }
}