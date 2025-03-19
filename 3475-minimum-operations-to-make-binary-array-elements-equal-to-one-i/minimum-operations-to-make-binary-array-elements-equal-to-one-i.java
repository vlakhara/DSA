class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n - 2; i++) {
            if(nums[i] == 0) {
                for(int j = 0; j < 3; j++) {
                    nums[i + j] = nums[i + j] == 0 ? 1 : 0;
                }
                ans++;
            }
        }

        if(nums[n - 1] == 0 || nums[n - 2] == 0) {
            return -1;
        }

        return ans;
    }
}