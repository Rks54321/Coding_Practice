package Trees;
class Node5 {
    int val;
    Node5 left;
    Node5 right;
    Node5(int val) {
        this.val = val;
    }
}
public class SymmetricTree2 {
    static void main(String[] args) {
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.right = new Node5(2);

        root.left.left = new Node5(3);
        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(Node5 root) {
        return root == null || isMirror(root.left, root.right);
    }
    public static boolean isMirror(Node5 p, Node5 q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isMirror(p.left, q.right) && isMirror(p.right, q.right);
    }
}
