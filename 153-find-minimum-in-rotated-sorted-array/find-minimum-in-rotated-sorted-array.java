class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int min = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }

        return min;
    }
}

/**
0 1 2 3 4
3 4 5 1 2



 */