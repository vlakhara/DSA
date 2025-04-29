class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> eles = new HashMap<>();

        long sum = 0;
        long maxSum = 0;

        for(int i = 0; i < k; i++) {
            eles.put(nums[i], eles.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }

        if(eles.size() == k) {
            maxSum = sum;
        }

        for(int i = k; i < n; i++) {
            int left = nums[i - k];
            int right = nums[i];

            eles.put(left, eles.getOrDefault(left, 0) - 1);

            if(eles.get(left) <= 0) {
                eles.remove(left);
            }

            eles.put(right, eles.getOrDefault(right, 0) + 1);

            sum += right - left;

            if(eles.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}