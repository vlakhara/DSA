class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> freq = new HashSet<>();
        int distinct = 0;

        int n = s.length();

        int left = 0;
        int right = 0;

        while (right < n) {
            char ch = s.charAt(right);
            while (freq.contains(ch)) {
                char remove = s.charAt(left++);
                freq.remove(remove);
            }
            freq.add(ch);
            distinct = Math.max(distinct, right - left + 1);
            right++;
        }

        return distinct;
    }
}