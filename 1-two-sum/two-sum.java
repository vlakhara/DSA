class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)) {
                return new int[] {i, map.get(rem)};
            }
            map.put(num, i);
        }
        return new int[2];
    }
}