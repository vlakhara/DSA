class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        int maxRange = 0;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            str.append(ch);
            maxRange = Math.max(maxRange, lastIndexMap.get(ch));
            
            if(maxRange == i) {
                ans.add(str.length());
                str.setLength(0);
            }
        }

        return ans;
    }
}