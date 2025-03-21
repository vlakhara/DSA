class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];
        for (int i = 0; i < n - 1; i++) {
            int rem = target - numbers[i];

            int left = i + 1;
            int right = n - 1; 

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (numbers[mid] == rem) {
                    ans[0] = i + 1;
                    ans[1] = mid + 1;
                    return ans;
                } else if (numbers[mid] > rem) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return ans;
    }
}