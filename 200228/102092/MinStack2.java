import java.util.Stack;

class MinStack {
    Stack<Integer> value;
    Stack<Integer> minValue;

    /** initialize your data structure here. */
    public MinStack() {
        value = new Stack<>();
        minValue = new Stack<>();
    }

    public void push(int x) {
        if (minValue.isEmpty() || x <= minValue.peek()) {
            minValue.push(x);
        }
        value.push(x);
    }

    public void pop() {
        if (value.peek().equals(minValue.peek())) {
            minValue.pop();
        }
        value.pop();
    }

    public int top() {
        return value.peek();
    }

    public int getMin() {
        return minValue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */