class Solution {
    public boolean isArraySpecial(int[] nums) {

        int n = nums.length;

        if(n <= 1) {
            return true;
        }

        boolean flag = nums[0] % 2 == 0;

        for(int i = 1; i < n; i++) {
            boolean check = nums[i] % 2 == 0;

            if(check != flag) {
                flag = check;
            } else {
                return false;
            }
        }

        return true;
    }
}