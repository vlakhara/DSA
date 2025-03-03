class Solution {
    public int maxVowels(String s, int k) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (check(ch)) {
                currentMax++;
            }

            if (i >= k && check(s.charAt(i - k))) {
                    currentMax--;
            }

            maxSoFar = Math.max(maxSoFar, currentMax);
          
        }

        return maxSoFar;
    }

    public static boolean check(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}