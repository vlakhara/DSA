class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean check = true;
        String s = "";
  
        for (int i = 0; i < 200; i++) {

            if (i >= strs[0].length()) {
                check = false;
                break;
            }

            char ch = strs[0].charAt(i);
            for (String str : strs) {

                if (i >= str.length()) {
                    check = false;
                    break;
                }

                check = ch == str.charAt(i);
                if (!check) {
                    break;
                }
            }

            if (check) {
                s = s + ch;
            } else {
                break;
            }
        }
        return s;
    }
}