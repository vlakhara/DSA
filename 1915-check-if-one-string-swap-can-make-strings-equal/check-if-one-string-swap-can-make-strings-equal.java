class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        int low = 0;
        int high = s1.length() - 1;
        int count = 0;

        while (low < high) {
            while (low < high && s1Arr[low] == s2Arr[low]) {
                low++;
            }

            while (low < high && s1Arr[high] == s2Arr[high]) {
                high--;
            }

            if (s1Arr[low] != s2Arr[low] || s1Arr[high] != s2Arr[high]) {
                char temp = s2Arr[low];
                s2Arr[low] = s2Arr[high];
                s2Arr[high] = temp;

                count++; 

                if (count > 1) {
                    return false; 
                }
            }

            low++;
            high--;

        }

        return Arrays.equals(s1Arr, s2Arr);
    }
}