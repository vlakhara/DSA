class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;

        int[] ans = new int[n];

        Map<Integer, Integer> colors = new HashMap<>();
        Map<Integer, Integer> balls = new HashMap<>();
        
        
        /**

        map > {4, 1}, {5, 1}, {3, 1},
        ans > [1, 2, 2]
        
        0 0 0 0 0 
        0 4 0 0 0
        0 4 5 0 0
        0 3 5 0 0
        0 3 5 4 0

         */

         for(int i = 0; i < n; i++) {
            int[] query = queries[i];
            int ball = query[0];
            int color = query[1];

            if(balls.get(ball) != null) {
                colors.put(balls.get(ball), colors.get(balls.get(ball)) - 1);
                if(colors.get(balls.get(ball)) == 0) {
                    colors.remove(balls.get(ball));
                }
            } 

            balls.put(ball, color);
            colors.put(color, colors.getOrDefault(color, 0) + 1);

            ans[i] = colors.size();

         }

         return ans;

    }
}