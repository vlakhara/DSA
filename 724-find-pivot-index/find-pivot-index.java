class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        int[] postfix = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        for(int i = n - 1; i >= 0; i--) {
            postfix[i] = postfix[i + 1] + nums[i];
        }

        int left = 0;
        int right = n;

        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(postfix));

        for(int i = 0; i < n; i++) {
            if(prefix[i] == postfix[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}