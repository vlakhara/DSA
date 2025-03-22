class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]> stack = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[1]) {
                int[] peek = stack.pop();
                ans[peek[0]] = i - peek[0];
            }

            stack.add(new int[]{i, temperatures[i]});
        }

        return ans;
    }
}