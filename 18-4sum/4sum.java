class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = nums[i] + nums[j];
                    sum += nums[left];
                    sum += nums[right];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}

// -2 -1 0 0 1

/**
 * 
 * 
 * Set<Long> set = new HashSet<>();
 * for(int k = j + 1; k < n; k++) {
 * long sum = nums[i] + nums[j];
 * sum += nums[k];
 * 
 * long forth = target - sum;
 * 
 * if(set.contains(forth)) {
 * List<Integer> list = new ArrayList<>();
 * list.add(nums[i]);
 * list.add(nums[j]);
 * list.add(nums[k]);
 * list.add((int) forth);
 * Collections.sort(list);
 * ans.add(list);
 * }
 * set.add((long) nums[k]);
 * }
 * 
 * 
 */