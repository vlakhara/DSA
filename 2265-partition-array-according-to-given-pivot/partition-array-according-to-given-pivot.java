class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lower = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> pivots = new ArrayList<>();

        int index = 0;

        for(int i: nums) {
            if(i < pivot) {
                lower.add(i);
            } else if(i > pivot) {
                greater.add(i);
            } else {
                pivots.add(i);
            }
        }

        for(int i: lower) {
            nums[index++] = i;
        }

        for(int i: pivots) {
            nums[index++] = i;
        }

        for(int i: greater) {
            nums[index++] = i;
        }

        return nums;

    }
}