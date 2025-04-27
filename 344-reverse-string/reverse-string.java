class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length);
    }

    public static void reverse(char[] arr, int i, int n) {
        if(i >= n / 2) {
            return;
        }

        char temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverse(arr, i + 1, n);

    }
}