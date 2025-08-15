class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean check = true;
        int len = strs[0].length();
        String s = "";
        for(String sb : strs){
            if(sb.length() < len ){
                len = sb.length();
            }
        } 
        for(int i = 0 ; i < len ; i++){
            char ch = strs[0].charAt(i);
            for(String str : strs ){
               check = ch==str.charAt(i)?true:false;
                if(!check){
                    break;
                }
            }            
            if(check){
                s = s + ch;
            }
            else{
                break;
            }
        }
        return s.length()>0?s:"";
    }
}