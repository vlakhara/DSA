class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> sMap = new HashMap<>();

        for(char ch: s1.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> s2Map = new HashMap<>();

        int end = s1.length();

        int index = 0;

        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            char first = s2.charAt(index);

            if(i >= end) {
                if(s2Map.get(first) != null && s2Map.get(first) > 1) {
                    s2Map.put(first, s2Map.get(first) - 1);
                } else {
                    s2Map.remove(first);
                }
                index++;
            }

            s2Map.put(ch, s2Map.getOrDefault(ch, 0) + 1);

            if(sMap.equals(s2Map)) {
                return true;
            }
        }

        return false;
    }
}