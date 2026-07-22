package Trees;
import java.util.Queue;
import java.util.LinkedList;
class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}
public class MaxDepthBinaryTree3 {
    static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(6);

        System.out.println(maxDepth(node));
    }
    public static int maxDepth(Node node) {
        if(node == null) return 0;
        Queue<Node> elementQueue = new LinkedList<>();
        elementQueue.add(node);
        int numbersOfLevels = 0;
        while(true) {
            int nodesAtElement = elementQueue.size();
            if(nodesAtElement == 0) {
                return numbersOfLevels;
            }
            while(nodesAtElement > 0) {
                Node element = elementQueue.poll();
                if(element.left != null) {
                    elementQueue.add(element.left);
                }
                if(element.right != null) {
                    elementQueue.add(element.right);
                }
                nodesAtElement--;
            }
            numbersOfLevels++;
        }
    }
}
