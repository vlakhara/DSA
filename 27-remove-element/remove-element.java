class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int index = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }

        return index;
    }
}

/*
ans = 1
i id                     i id
0 0 [0,1,2,2,3,0,4,2] -> 0 1 [0,1,2,2,3,0,4,2]
1 1 [0,1,2,2,3,0,4,2] -> 1 2 [0,1,2,2,3,0,4,2]
2 2 [0,1,2,2,3,0,4,2] -> 3 2 [0,1,2,2,3,0,4,2]
3 2 [0,1,2,2,3,0,4,2] -> 4 2 [0,1,2,2,3,0,4,2]
4 2 [0,1,2,2,3,0,4,2] -> 4 3 [0,1,3,2,2,0,4,2]
5 3 [0,1,3,2,2,0,4,2] -> 5 4 [0,1,3,0,2,2,4,2]
6 4 [0,1,3,0,2,2,4,2] -> 5 5 [0,1,3,0,4,2,2,2]

*/