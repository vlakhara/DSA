class Solution {
    public int tupleSameProduct(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int prod = nums[i] * nums[j];
                freq.put(prod, freq.getOrDefault(prod, 0) + 1);
            }
        }

        int ans = 0;

        for(int value : freq.values()) {
            value = (value * (value - 1)) / 2;
            ans += 8 * value;
        }

        return ans;
    }
}


/**

1 12 6 2 = 12
1 12 3 4 = 12
6 2 4 3 = 12
3 2 6 1 = 6
12 2 6 4 = 24


1 * 12 = 12
1 * 6 = 6
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4

12 * 6 = 72
12 * 2 = 24
12 * 3 = 36
12 * 4 = 46

6 * 2 = 12
6 * 3 = 18
6 * 4 = 24

2 * 3 = 6
2 * 4 = 8

3 * 4 = 12


p1 p2 p3 p4 p5

p1 p2
p1 p3
p1 p4
p1 p5
p2 p3 
p2 p4
p2 p5
p3 p4
p3 p5
p4 p5


 */