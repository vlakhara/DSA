class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        Arrays.fill(ans, 1);
        
        int prefix = 1;
        int postfix = 1;

        for(int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix = nums[i] * prefix;
        }

        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix = nums[i] * postfix;
        }

        return ans;

    }
}