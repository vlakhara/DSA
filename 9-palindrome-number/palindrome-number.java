class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int rev = 0;
        int dummy = x;

        while(dummy > 0) {
            rev = (rev * 10) + (dummy % 10);
            dummy /= 10;
        }

        return rev == x;
    }
}