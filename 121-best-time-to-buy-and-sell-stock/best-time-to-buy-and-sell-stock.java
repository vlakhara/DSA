class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        int n = prices.length;

        // int left = 0;
        // int right = 1;

        // while (right < n) {
        //     if (prices[left] < prices[right]) {
        //         profit = Math.max(profit, prices[right] - prices[left]);
        //     } else {
        //         left = right;
        //     }
        //     right++;
        // }
        // return profit;

        for(int i = 0; i < n; i++) {
            int cost = prices[i] - minPrice; 
            maxProfit = Math.max(cost, maxProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}