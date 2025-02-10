class Solution {
    public String clearDigits(String s) {
        Stack<Integer> closest = new Stack<>();
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            int code = (int) arr[i];
            if(code >= 97 && code <= 122) {
                closest.push(i);
            } else {
                arr[i] = 'A';
                if(!closest.isEmpty()) {
                    int peek = closest.pop();
                    arr[peek] = 'A';
                }

            }
        }
        return new String(arr).replace("A", "");
    }
}