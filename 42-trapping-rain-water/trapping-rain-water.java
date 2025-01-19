class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;

        int[] prefix = new int[n];

        prefix[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], height[i]);
        }

        int[] postfix = new int[n];

        postfix[n - 1] = height[n - 1];
        for (int i = n - 2; i >=  0; i--) {
            postfix[i] = Math.max(postfix[i + 1], height[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            if(height[i] <= prefix[i] && height[i] <= postfix[i]) {
                total += Math.min(prefix[i], postfix[i]) - height[i];
            }
        }

        return total;
    }
}