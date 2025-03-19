class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int current = 0;

        for(int num : nums) {
            current += num;

            maxSoFar = Math.max(maxSoFar, current);

            if(current <= 0) {
                current = 0;
            }
        }

        return maxSoFar;
    }
}