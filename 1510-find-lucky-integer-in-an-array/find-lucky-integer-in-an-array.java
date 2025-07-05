class Solution {

    int[] freq = new int[501];

    public int findLucky(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for(int i = 500; i >= 1; i--) {
            if(freq[i] == i) {
                return i;
            }
        }

        return -1;
    }
}