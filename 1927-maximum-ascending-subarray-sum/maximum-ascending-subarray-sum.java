class Solution {
    public int maxAscendingSum(int[] nums) {

        int n = nums.length;

        if(n == 1) {
            return nums[0];
        }

        int current = nums[0];
        int ans = nums[0];

        for(int i = 1; i < n; i++) {
            if(nums[i - 1] < nums[i]) {
                current += nums[i];
            } else {
                ans = Math.max(current, ans);
                current = nums[i];
            }
        }

        return Math.max(current, ans);
    }
}