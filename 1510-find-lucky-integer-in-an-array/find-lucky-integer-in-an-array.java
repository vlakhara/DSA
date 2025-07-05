class Solution {

    int[] freq = new int[501];

    public int findLucky(int[] arr) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int max = -1;

        while(left <= right) {
            if(left == right) {
                freq[arr[left]]++;
            } else {
                freq[arr[left]]++;
                freq[arr[right]]++;
            }
            left++;
            right--;
        }

        left = 0;
        right = n - 1;


        // for(int i = 0; i < n; i++) {
        //     freq[arr[i]]++;
        // }

        for(int i = 0; i < n; i++) {
            if(freq[arr[i]] == arr[i]) {
                max = Math.max(max, arr[i]);
            }
        }

        // while(left <= right) {
        //     if(left == right) {
        //         max = Math.max(max, arr[left]);
        //     } else {
        //         max = Math.max(max, arr[left]);
        //         max = Math.max(max, arr[right]);
        //     }
        //     left++;
        //     right--;
        // }

        return max;
    }
}