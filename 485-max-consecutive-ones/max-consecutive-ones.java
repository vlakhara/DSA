class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int current = 0;

        for(int num : nums) {
            if(num == 1) {
                current++;
            } else {
                maxOnes = Math.max(maxOnes, current);
                current = 0;
            }
        }

        return Math.max(maxOnes, current);
    }
}