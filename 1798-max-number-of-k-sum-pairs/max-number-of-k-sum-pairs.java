class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            if(map.containsKey(i)) {
                if(map.get(i) > 1) {
                    map.put(i, map.get(i) - 1);
                } else {
                    map.remove(i);
                }
                ans++;
            } else {
                map.put(k - i, map.getOrDefault(k - i, 0) + 1);
            }
        }

        return ans;
    }
}

/**

4

[2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2]

 */