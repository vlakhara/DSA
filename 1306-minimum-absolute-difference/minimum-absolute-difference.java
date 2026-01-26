class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        sort(arr, 0, arr.length - 1);
        int min = arr[1] - arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            if(Math.abs(arr[i] - arr[i + 1]) < min) {
                min = Math.abs(arr[i] - arr[i + 1]);
            }
        }

        List<List<Integer>> answers = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            
            if (Math.abs(arr[i] - arr[i - 1]) == min) {
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i - 1]);
                ans.add(arr[i]);
                answers.add(ans);
            }
        }

        return answers;
    }

    private static void sort(int[] arr, int start, int end) {
        if(start == end) {
            return;
        }

        int mid = start + ((end - start) / 2);

        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1]; // 0, 0, 1
        int left = start;
        int right = mid + 1;
        int index = 0;

        while(left <= mid && right <= end) {
            if(arr[left] < arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        while(left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }

        while(right <= end) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        for(int i = start; i <= end ; i++) { // 0 -> 1
            arr[i] = temp[i - start]; // 0
        }
    }
}