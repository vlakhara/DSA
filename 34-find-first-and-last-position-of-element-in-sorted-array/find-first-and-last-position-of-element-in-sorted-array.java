class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1, -1};
        int lb = lowerBound(nums, nums.length, target);

        if(lb == nums.length || nums[lb] != target) {
            return ans;
        }

        ans[0] = lb;
        ans[1] = upperBound(nums, nums.length, target) - 1;

        return ans;
    }

    static int lowerBound(int[] nums, int n, int target) {
        int left = 0;
        int right = n - 1;
        int ans = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] nums, int n, int target) {
        int left = 0;
        int right = n - 1;
        int ans = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}