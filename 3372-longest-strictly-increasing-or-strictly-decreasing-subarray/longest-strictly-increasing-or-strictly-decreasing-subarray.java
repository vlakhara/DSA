class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        if(n <= 1) {
            return n;
        }

        int current = 1;
        int ans = 1;

        Boolean isIncreasing = nums[0] < nums[1];

        for(int i = 0; i < n - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                current = 1;
                continue;
            }

            if(isIncreasing) {
                isIncreasing = nums[i] < nums[i + 1];
                if(isIncreasing) {
                    current++;
                } else {
                    current = 2;
                }
            } else {
                isIncreasing = nums[i] < nums[i + 1];
                if(!isIncreasing) {
                    current++;
                } else {
                    current = 2;
                }
            }
            ans = Math.max(current, ans);
        }

        return Math.max(current, ans);
    }
}