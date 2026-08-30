package StackNQueue;

import java.util.Queue;
import java.util.LinkedList;
public class StackUsingQueeu2 {
    Queue<Integer> queue = new LinkedList<>();

    void push(int x) {
        queue.add(x);
        int size = queue.size();
        for(int i = 0; i < size-1; i++) {
            queue.add(queue.remove());
        }
    }
    int pop() {
        if(queue.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return queue.remove();
    }
    public static void main(String[] args) {
        StackUsingQueeu2 s = new StackUsingQueeu2();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
