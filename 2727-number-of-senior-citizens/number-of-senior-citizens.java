class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;

        for(int i = 0; i < details.length; i++) {
            String str = details[i];
            int len = str.length();
            int age = Integer.parseInt(str.substring(11, len - 2));

            if(age > 60) {
                ans++;
            }
        }

        return ans;
    }
}