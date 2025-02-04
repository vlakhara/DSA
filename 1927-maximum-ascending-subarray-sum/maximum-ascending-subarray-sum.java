class Solution {
    public int maxAscendingSum(int[] nums) {

        int n = nums.length;

        int current = nums[0];
        int ans = nums[0];

        for(int i = 1; i < n; i++) {
            if(nums[i - 1] < nums[i]) {
                current += nums[i];
            } else {
                current = nums[i];
            }
            ans = Math.max(current, ans);
        }

        return ans;
    }
}