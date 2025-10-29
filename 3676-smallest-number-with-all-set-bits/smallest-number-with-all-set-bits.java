class Solution {
    public int smallestNumber(int n) {
        for(int i = 0; i <= n; i++) {
            int test = 1 << i;

            if(test > n) return test - 1;
        }

        return 0;
    }
}