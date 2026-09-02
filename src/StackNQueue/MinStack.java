package StackNQueue;
import java.util.Stack;
public class MinStack {

        Stack<Integer> stack;
        Stack<Integer> minSt;

        public MinStack() {
            stack = new Stack<>();
            minSt = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if(minSt.isEmpty() || x <= minSt.peek()) {
                minSt.push(x);
            }
        }

        public void pop() {
            if(stack.peek().equals(minSt.peek())) {
                minSt.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minSt.peek();
        }

    static void main(String[] args) {
            MinStack ms = new MinStack();
            ms.push(10);
            ms.push(20);
            ms.push(30);

            System.out.println("Top: " + ms.top());
            System.out.println("Minimum: " + ms.getMin());

            ms.pop();

            System.out.println("After Pop");
            System.out.println("Top: " + ms.top());
            System.out.println("Minimum: " + ms.getMin());

    }
}
