class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int distinct = 0;

        int n = s.length();

        int left = 0;
        int right = 0;

        while (right < n) {
            char ch = s.charAt(right);
            freq[ch]++;

            while (freq[ch] > 1) {
                char remove = s.charAt(left++);
                freq[remove]--;
            }

            distinct = Math.max(distinct, right - left + 1);
            right++;
        }

        return distinct;
    }
}