class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = -1e5;
        double sum = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(i >= k - 1) {
                average = Math.max(sum / k, average);
                sum -= nums[index++];
            }
        }

        return average;

    }
}