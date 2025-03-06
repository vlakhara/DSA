class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = (int) Math.pow(grid.length, 2);
        int total = (n * (n + 1)) / 2;
        int sum = 0;

        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();

        for(int[] row : grid) {
            for(int i: row) {
                if(set.add(i)) {
                    sum += i;
                } else {
                    ans[0] = i;
                }
            }
        }
        ans[1] = total - sum;

        return ans;
    }
}