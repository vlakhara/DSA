class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        int maxRange = 0;
        int partitionSize = 0;
        for (int i = 0; i < n; i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            partitionSize++;
            maxRange = Math.max(maxRange, lastIndexMap.get(ch));

            if(maxRange == i) {
                ans.add(partitionSize);
                partitionSize = 0;
            }
        }

        return ans;
    }
}