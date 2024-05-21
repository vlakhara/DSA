
class Kth_Closest_Element {

    public static void main(String[] args) {
        int n = 13;
        int[] arr = {12, 16, 22, 30, 35, 39, 42,
            45, 48, 50, 53, 55, 56};
        int k = 4;
        int x = 35;

        int pos = binarySearch(arr, 0, n - 1, x);
        int left = pos - 1;
        int right = pos;
        int i = 0;
        int[] ans = new int[k];

        if (right < n && arr[right] == x) {
            right++;
        }

        while (k > 0 && left >= 0 && right < n) {
            int leftD = Math.abs(arr[left] - x);
            int rightD = Math.abs(arr[right] - x);

            if (leftD < rightD) {
                ans[i++] = arr[left--];
            } else if (rightD < leftD) {
                ans[i++] = arr[right++];
            } else {
                if (arr[right] > arr[left]) {
                    ans[i++] = arr[right++];
                } else {
                    ans[i++] = arr[left--];
                }
            }

            k--;
        }

        while (k > 0 && left >= 0) {
            ans[i++] = arr[left--];
            k--;
        }

        while (k > 0 && right < n) {
            ans[i++] = arr[right++];
            k--;
        }

        // return ans;
    }

    static int binarySearch(int[] arr, int low, int high, int x) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid; 
            }else if (arr[mid] < x) {
                low = mid + 1; 
            }else {
                high = mid - 1;
            }
        }

        return low;
    }
}
