class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ones = 0;

        for(int i : derived) {
            if(i == 1) {
                ones++;
            }
        }

        return ones % 2 == 0;
    }
}