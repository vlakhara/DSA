class Solution {
    public long putMarbles(int[] weights, int k) {

        int n = weights.length;

        if(k == 1) {
            return 0l;
        }

        int[] splits = new int[n - 1];

        for(int i = 0; i < n - 1; i++) {
            splits[i] = weights[i] + weights[i + 1]; 
        }

        Arrays.sort(splits);

        long max = 0;
        long min = 0;

        for(int i = 0; i < k - 1; i++) {
            max += splits[n - 2 - i];
            min += splits[i];
        }

        return max - min;
    }
}

/**

max = 1 + 1 + 8 = 10

min = 1 + 1 + 3 + 1 = 6

 */

 /**
 
60 40 100 129 115 91 101 108 121 103 93 83 55 31 46 102 88 59 5323 53 104 133

  */