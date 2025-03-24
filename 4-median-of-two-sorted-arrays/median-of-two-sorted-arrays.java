class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int indM = 0;
        int indN = 0;
        int index = 0;

        while (indM < m && indN < n) {
            if (nums1[indM] < nums2[indN]) {
                arr[index++] = nums1[indM++];
            } else {
                arr[index++] = nums2[indN++];
            }
        }

        while (indM < m) {
            arr[index++] = nums1[indM++];
        }

        while (indN < n) {
            arr[index++] = nums2[indN++];
        }

        int ans = arr[((m + n) / 2)];
        return arr.length % 2 == 0 ? (double) ((arr[(arr.length / 2)] + arr[(arr.length / 2) - 1]) / 2.0)
                : arr[arr.length / 2];

        // if((m + n) % 2 != 0) {
        // return (double) ans;
        // } else {
        // return (double) (arr[(m + n) / 2] + ans) / 2.0;
        // }

    }
}