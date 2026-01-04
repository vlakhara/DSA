class Solution {
    public int missingNumber(int[] nums) {

        int total = nums.length * (nums.length + 1) / 2;
        for(int num: nums) {
            total -= num;
        }
        return total;

        // int xor1 = 0;
        // int xor2 = 0;

        // for(int i = 0; i < nums.length; i++) {
        //     xor2 ^= nums[i];
        //     xor1 ^= (i + 1);
        // }
        // return xor1 ^ xor2;
    }
}