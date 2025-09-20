class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        boolean ans = false;
        for(int right = 0; right < n; right++) {
            if(map.containsKey(nums[right])) {
                if (right - map.get(nums[right]) <= k) {
                    return true;
                }
            }
            map.put(nums[right], right);
        }

        return false;
    }
}