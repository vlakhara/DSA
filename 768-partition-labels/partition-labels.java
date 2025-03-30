class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        int[] indexes = new int[26];

        int maxRange = 0;
        int partitionSize = 0;
        for (int i = 0; i < n; i++) {
            indexes[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            partitionSize++;
            maxRange = Math.max(maxRange, indexes[ch - 'a']);

            if(maxRange == i) {
                ans.add(partitionSize);
                partitionSize = 0;
            }
        }

        return ans;
    }
}