package Trees;
import java.util.List;
import java.util.LinkedList;
class Node6 {
    int val;
    Node6 left;
    Node6 right;
    Node6(int val) {
       this.val = val;
    }
}
public class BinaryTreeTraversal {
    static void main(String[] args) {
        List<Integer> result = new LinkedList<>();
        Node6 root = new Node6(1);
        root.left = new Node6(2);
        root.right = new Node6(3);
        root.left.left = new Node6(4);
        root.left.right = new Node6(5);
        preOrder(root, result);
        System.out.println(result);
    }
    public static void preOrder(Node6 root, List<Integer> result) {
        if(root == null) return;
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }
}
