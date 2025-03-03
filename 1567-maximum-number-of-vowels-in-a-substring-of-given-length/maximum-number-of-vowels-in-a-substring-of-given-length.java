class Solution {
    public int maxVowels(String s, int k) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;
        int last = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i >= k) {
                maxSoFar = Math.max(maxSoFar, currentMax);
                if (check(s.charAt(last++))) {
                    currentMax--;
                }
            }

            if (check(ch)) {
                currentMax++;
            }
        }

        return Math.max(maxSoFar, currentMax);
    }

    public static boolean check(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}