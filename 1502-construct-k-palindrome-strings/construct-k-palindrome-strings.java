class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int odd = 0;

        for(Integer num: map.values()) {
            if(num % 2 != 0) {
                odd++;
            }
        }

        return odd <= k;
    }
}

/**

a2n2b1e2l2

l1e2t1c1o1d1e1

 */