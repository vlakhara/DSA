class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num: arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        boolean[] present = new boolean[max - min + 1];

        for(int num : arr) {
            present[num - min] = true;
        }

        int minDiff = Integer.MAX_VALUE;
        int prev = -1;

        for(int i = 0; i < present.length; i++) {
            if(present[i]) {
                if(prev != -1) {
                    minDiff = Math.min(minDiff, i - prev);
                }
                prev = i;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        prev = -1;

        for(int i = 0; i < present.length; i++) {
            if(present[i]) {
                if(prev != -1 && i - prev == minDiff) {
                    ans.add(Arrays.asList(
                        prev + min,
                        i + min
                    ));
                }
                prev = i;
            }
        }

        return ans;
    }
}