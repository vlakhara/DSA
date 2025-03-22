class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            String token = tokens[i];
            if(token.equals("+")) {
                stack.add(stack.pop() + stack.pop());
            } else if(token.equals("*")) {
                stack.add(stack.pop() * stack.pop());
            } else if(token.equals("-")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.add(second - first);
            } else if(token.equals("/")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.add(second / first);
            } else {
                stack.add(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}