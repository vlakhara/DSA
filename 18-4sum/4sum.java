class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                Set<Long> set = new HashSet<>();
                for(int k = j + 1; k < n; k++) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];

                    long forth = target - sum;

                    if(set.contains(forth)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add((int) forth);
                        Collections.sort(list);
                        ans.add(list);
                    }
                    set.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(ans);
    }
}

// -2 -1 0 0 1 2