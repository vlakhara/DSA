class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        // int low = 0;
        // int high = n - 1;

        for(int i = 1; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                continue;
            } else {
                if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                    return i;
                } 
            }
        }

        return n - 1;
        
    }
}