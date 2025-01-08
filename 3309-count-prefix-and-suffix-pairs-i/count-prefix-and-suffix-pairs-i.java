class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static boolean isPrefixAndSuffix(String s1, String s2) {
        int temp = s2.length() - s1.length();
        System.out.println(temp);
        return s2.indexOf(s1) == 0 && s2.lastIndexOf(s1) == temp; 
    } 
}