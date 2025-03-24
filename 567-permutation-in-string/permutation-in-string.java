class Solution {

    private final Map<String, int[]> cache = new HashMap<>(); // Cache for frequency arrays
    private final String str = "abcdefghijklmnopqqrstuvwxyz";

    public void Solution() {
        for (int i = 0; i < 26; i++) {
            String subStr = str.substring(0, i);
            checkInclusion(subStr, subStr);
        }
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = getFrequencyArray(s1); // Retrieve from cache
        int[] freq2 = new int[26];

        int end = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (i >= end) {
                freq2[s2.charAt(i - end) - 'a']--;
            }

            freq2[ch - 'a']++;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }

    private int[] getFrequencyArray(String s) {
        if (cache.containsKey(s)) {
            return cache.get(s); // Use cached result
        }

        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        cache.put(s, freq); // Store in cache
        return freq;
    }
}