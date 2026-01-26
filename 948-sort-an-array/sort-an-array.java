class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }

    public static void divide(int[] nums, int start, int end) {
        if(start == end) {
            return;
        }

        int middle = start + (end - start) / 2;

        divide(nums, start, middle);
        divide(nums, middle + 1, end);
        merge(nums, start, middle, end);
    }

    public static void merge(int[] nums, int start, int middle, int end) {
        int[] arr = new int[end - start + 1];
        int left = start;
        int right = middle + 1;
        int index = 0;

        while(left <= middle && right <= end) {
            if(nums[left] < nums[right]) {
                arr[index++] = nums[left++];
            } else {
                arr[index++] = nums[right++];
            }
        }

        while(left <= middle) {
            arr[index++] = nums[left++];
        }

        while(right <= end) {
            arr[index++] = nums[right++];
        }

        for(int i = start; i <= end; i++) {
            nums[i] = arr[i - start];
        }
    }
}