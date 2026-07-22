package Trees;
import java.util.Queue;
import java.util.LinkedList;
class Node2 {
    int val;
    Node2 left;
    Node2 right;
    Node2(int val) {
        this.val = val;
    }
        }
public class SameTree {
    static void main(String[] args) {
    Node2 p = new Node2(1);
    Node2 q = new Node2(1);

    p.left = new Node2(2);
    q.left = new Node2(2);
    q.left = new Node2(3);
    q.right = new Node2(3);
    p.left.left = new Node2(3);
    q.left.left = new Node2(3);

    System.out.println(sameTree(p,q));
    }
    public static boolean sameTree(Node2 p, Node2 q) {
        Queue<Node2> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

//        Loop till queue is not empty
        while(!queue.isEmpty()) {
            Node2 first = queue.poll();
            Node2 second = queue.poll();
//            Check element
            if(first == null && second == null) {
                continue;
            } else if (first == null || second == null || first.val != second.val) {
                return false;
            }

//            Add other element
            queue.add(first.left);
            queue.add(second.left);
            queue.add(first.right);
            queue.add(second.right);
        }
        return true;
    }
}
