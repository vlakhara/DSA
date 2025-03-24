class Solution {

    String str = "abcdefghijklmnopqqrstuvwxyz";

    public void Solution() {
        for(int i = 0; i < 26; i++) {
            checkInclusion(str.substring(0, i), str.substring(0, i));
        }
    }


    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch: s1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        int end = s1.length();

        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if(i >= end) {
                freq2[s2.charAt(i - end) - 'a']--;
            }

            freq2[ch - 'a']++;

            if(Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}