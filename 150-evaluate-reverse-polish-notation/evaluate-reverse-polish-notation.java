class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            String token = tokens[i];
            if(isOperator(token)) {
                int first = stack.pop();
                int second = stack.pop();
                int newNum = 0;
                switch(token) {
                    case "+":
                        newNum = first + second;
                        break;
                    case "*":
                        newNum = first * second;
                        break;
                    case "-":
                        newNum = second - first;
                        break;
                    case "/":
                        newNum = second / first;
                        break;
                }
                stack.add(newNum);
            } else {
                stack.add(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }

    public static boolean isOperator(String ch) {
        return ch.equals("-") || ch.equals("+") || ch.equals("*") || ch.equals("/");
    }
}