class Solution {
    public char kthCharacter(int k) {
        return generate("a", k);
    }

    public static char generate(String str, int k) {
        if(str.length() >= k) {
            return str.charAt(k - 1);
        }

        String temp = "";

        for(char ch: str.toCharArray()) {
            temp += (char) ((int) ch + 1);
        }

        return generate(str + temp, k);
    }
}