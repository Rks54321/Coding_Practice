package Trees;
class Node3 {
    int val;
    Node3 left;
    Node3 right;
    Node3(int val) {
        this.val = val;
    }
}
public class SameTree2 {
    static void main(String[] args) {
        Node3 p = new Node3(1);
        Node3 q = new Node3(1);

        p.left = new Node3(2);
        q.left = new Node3(2);

        p.right = new Node3(3);
        q.right = new Node3(3);


        System.out.println(isSame(p, q));
    }
    public static boolean isSame(Node3 p, Node3 q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSame(p.left, q.left) && isSame(q.right, q.right);
    }
}
