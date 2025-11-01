class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int maxFreq = 0;
        for(int key: freq.keySet()) {
            if(freq.get(key) >= maxFreq) {
                maxFreq = freq.get(key);
                max = key;
            }
        }
        return max;        
    }
}