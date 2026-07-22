package Trees;
import java.util.Queue;
import java.util.LinkedList;
class Node1 {
    int val;
    Node1 left;
    Node1 right;
    Node1(int val) {
        this.val = val;
    }
}
public class Same_Tree {
    static void main(String[] args) {
    Node1 p = new Node1(1);
    Node1 q = new Node1(1);

    p.left = new Node1(2);
    q.left = new Node1(2);
    p.right = new Node1(3);
    q.right = new Node1(3);

    System.out.println(sameTree(p, q));
    }
    public static boolean sameTree(Node1 p, Node1 q) {
        Queue<Node1> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
//        Loop till queue is empty
        while(!queue.isEmpty()) {
            Node1 first = queue.poll();
            Node1 second = queue.poll();
//         Check for equality
            if(first == null && second == null) {
                continue;
            } else if (first == null || second == null || first.val != second.val) {
                return false;
            }
//            Add another element
            queue.add(first.left);
            queue.add(second.left);
            queue.add(first.right);
            queue.add(second.right);
        }
        return true;
    }
}
