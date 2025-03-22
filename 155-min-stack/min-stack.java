class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
      stack = new Stack<>();
      minStack = new Stack<>();
    }
    
    public void push(int val) {
        this.stack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        int popped = this.stack.pop();

        if(!minStack.isEmpty() && popped == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */