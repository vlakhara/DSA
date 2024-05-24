class countPartition {
    
    static int mod = (int)(Math.pow(10, 9) + 7);
    public static int countPartitions(int n, int d, int[] arr) {
        int totalSum = 0;

        for(int i = 0; i < n ; i++) {
            totalSum += arr[i];
        }

        if(totalSum - d < 0) {
            return 0;
        }

        if((totalSum - d) % 2 == 1) {
            return 0;
        }

        int s2 = (totalSum - d) / 2;

        int[][] dp = new int[n][s2+1];

        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }

        return difference(n - 1, s2, arr, dp);
    }

    static int difference(int index, int target, int[] arr, int[][] dp) {
        if(index == 0) {
            if(target == 0 && arr[0] == 0) {
                return 2;
            } else if(target == 0 || target == arr[0]) {
                return 1;
            } else {
                return 0;
            }
        }

        if(dp[index][target] != -1) {
            return dp[index][target];
        }

        int notTaken = difference(index - 1, target, arr, dp);

        int taken = 0;

        if(arr[index] <= target) {
            taken = difference(index - 1, target - arr[index], arr, dp);
        }

        return dp[index][target] = (taken + notTaken) % mod;

    }
}
        
