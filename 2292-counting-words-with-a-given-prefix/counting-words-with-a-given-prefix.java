class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(String str :words) {
            if(str.indexOf(pref) == 0) ans++;
        }
        return ans;
    }
}