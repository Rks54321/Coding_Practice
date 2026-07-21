package Trees;
import java.util.Queue;
import java.util.LinkedList;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class MaxDepthBinaryTree {
    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        int depth = maxDepth(root);
        System.out.println(depth);
    }
    public static int maxDepth(TreeNode root) {
        Queue<TreeNode> elementQueue = new LinkedList<>();
        if(root == null) {
            return 0;
        }
        elementQueue.add(root);
        int numberOflevels = 0;
        while(true) {
            int nodeCountAtLevels = elementQueue.size();
            if(nodeCountAtLevels == 0) {
                return numberOflevels;
            }
            while(nodeCountAtLevels > 0) {
                TreeNode element = elementQueue.poll();
                if(element.left != null) {
                    elementQueue.add(element.left);
                }
                if(element.right != null) {
                    elementQueue.add(element.right);
                }
                nodeCountAtLevels--;
            }
            numberOflevels++;
        }
    }
}
