class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        if(n <= 1) {
            return 0;
        }
        
        if(nums[0] == 0) {
            return -1;
        }

        int step = nums[0];
        int maxRange = nums[0];
        int jumps = 1; // 2
        for(int i = 1; i < n; i++) {
            if(i == n - 1) {
                return jumps;
            }

            maxRange = Math.max(maxRange, i + nums[i]); // 4
            step--; // 1 0

            if(step == 0) {
                jumps++;
                if(i >= maxRange) {
                    return -1;
                }
                step = maxRange - i;
            }
        }

        return jumps;
        
    }
}