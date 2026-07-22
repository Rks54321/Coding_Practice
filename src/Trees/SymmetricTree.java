package Trees;
import java.util.Queue;
import java.util.LinkedList;
class Node4 {
    int val;
    Node4 left;
    Node4 right;
    Node4(int val) {
        this.val = val;
    }
}
public class SymmetricTree {
    static void main(String[] args) {
        Node4 root = new Node4(1);
        root.left = new Node4(2);
        root.right = new Node4(2);
        root.left = new Node4(3);

        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(Node4 root) {
        if(root == null) return true;
        Queue<Node4> leftTree = new LinkedList<>();
        Queue<Node4> rightTree = new LinkedList<>();
        leftTree.add(root.left);
        rightTree.add(root.right);
//        Loop untill leftTree and rightTree is not empty
        while(!leftTree.isEmpty() && !rightTree.isEmpty()) {
            Node4 leftNode = leftTree.poll();
            Node4 rightNode = rightTree.poll();

            if(leftNode == null && rightNode == null) continue;
            if(leftNode == null || rightNode == null || leftNode.val != rightNode.val) return false;

//            Add other elements
            leftTree.add(leftNode.left);
            rightTree.add(rightNode.right);
            leftTree.add(leftNode.right);
            rightTree.add(rightNode.left);
        }
        return true;
    }
}
