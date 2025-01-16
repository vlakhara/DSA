class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int f = 0;
        int s = 0;

        if(n % 2 != 0) {
            for(int i : nums1) {
                f ^= i;
            }
        }

        if(m % 2 != 0) {
            for(int i : nums2) {
                s ^= i;
            }
        }

        return f ^ s;
    }
}