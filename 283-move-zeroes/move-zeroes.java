class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        int left = 0;
        int right = 1;

        while(right < n) {
            while(right < n && nums[left] != 0) {
                left++;
                right++;
            }

            while(right < n && nums[right] == 0) {
                right++;
            }

            if(right >= n) {
                continue;
            }

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right++;
        }
    }
}

/**
n = 5

0 1 0 3 12
l
r
0 1 0 3 12
l r
1 0 0 3 12
l r
  l   r
1 3 0 0 12
    l   12
*/