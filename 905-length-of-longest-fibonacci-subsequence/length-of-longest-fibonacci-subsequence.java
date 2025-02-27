class Solution {
    public int lenLongestFibSubseq(int[] arr) {

        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        int maxSoFar = 0;

        for(int num: arr) {
            set.add(num);
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int sum = a + b;
                int currentMax = 0;

                while(set.contains(sum)) {
                    currentMax++;
                    a = b;
                    b = sum;
                    sum = a + b;
                }

                if(currentMax > 0) {
                    maxSoFar = Math.max(currentMax + 2 , maxSoFar);
                }
            }
        }

        return maxSoFar;
    }
}