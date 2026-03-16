class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        while (true) {
            List<Integer> permutation = nextPermitation(nums);
            if (permutation != null) {
                ans.add(permutation);
            } else {
                break;
            }
        }

        return ans;
    }

    private static List<Integer> nextPermitation(int[] arr) {
        int n = arr.length;
        int dip = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                dip = i;
                break;
            }
        }

        if (dip == -1) {
            return null;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[dip]) {
                swap(arr, i, dip);
                break;
            }
        }

        reverse(arr, dip + 1, n - 1);

        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            swap(arr, i++, j--);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}