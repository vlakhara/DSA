class Solution {
    public void moveZeroes(int[] nums) {
        // ------------------------------------------------------
        
        int n = nums.length;
        int l = 0;

        for(int r = 0; r < n; r++) { // O (N)
            if(nums[r] != 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }

        // ------------------------------------------------------

        // int l = -1;

        // for (int i = 0; i < n; i++) { // O (X)
        //     if(nums[i] == 0) {
        //         l = i;
        //         break;
        //     }
        // }

        // if (l == -1) {
        //     return;
        // }

        // for (int i = l + 1; i < n; i++) { O (N - X)
        //     if (nums[i] != 0) {
        //         int temp = nums[i];
        //         nums[i] = nums[l];
        //         nums[l] = temp;
        //         l++;
        //     }
        // }

        // O (X) + O (N - X) = O (N)

        // ------------------------------------------------------

        // int i = 0;

        // for (int num : nums) { // O (N)
        //     if (num != 0) {
        //         nums[i++] = num;
        //     }
        // }

        // while (i < n) { // O (N)
        //     nums[i++] = 0;        
        // }

        // O (2N) = O (N)

        // ------------------------------------------------------
    }
}