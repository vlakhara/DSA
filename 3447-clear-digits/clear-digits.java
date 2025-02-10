class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> closest = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') { 
                closest.push(result.length()); 
                result.append(c);
            } else { 
                if (!closest.isEmpty()) {
                    result.setLength(closest.pop()); 
                }
            }
        }

        return result.toString();
    }
}