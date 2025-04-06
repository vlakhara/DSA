class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }

        
        int left = 1;
        int right = max;

        int ans = max;

        while(left <= right) {
            int mid = (right + left) / 2;

            int neededHrs = 0; // 1 2 3 4

            for(int num: piles) {
                neededHrs += Math.ceil((double) num / mid);
            } 

            if(neededHrs <= h) {
                ans = Math.min(ans, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}