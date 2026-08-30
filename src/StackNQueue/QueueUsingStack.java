package StackNQueue;
import java.util.Stack;
public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int x) {
        stack1.push(x);
    }

    int dequeue() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return stack2.pop();
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
