class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
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
}