package Trees;
import java.util.List;
import java.util.LinkedList;
class Tree6{
    int val;
    Tree6 left;
    Tree6 right;
    Tree6(int val) {
        this.val = val;
    }
}
public class BinaryInorderTraversal {
    static void main(String[] args) {
    Tree6 root = new Tree6(1);
    root.left = new Tree6(2);
    root.right = new Tree6(3);
    root.left.left = new Tree6(4);
    root.right.left = new Tree6(5);
    List<Integer> res = new LinkedList<>();
    inOrder(root, res);
    System.out.println(res);
    }
    public static void inOrder(Tree6 root, List<Integer> res) {
        if(root == null) return;
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }
}
