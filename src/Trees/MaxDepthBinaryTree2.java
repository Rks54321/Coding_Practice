package Trees;
import java.util.Queue;
import java.util.LinkedList;
class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int val) {
        this.val = val;
    }
}
public class MaxDepthBinaryTree2 {
    static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);

        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);

        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);

        root.left.left.left = new TreeNode1(6);
        root.left.left.right = new TreeNode1(7);

        int maxDepth = maxDepth(root);
        System.out.println(maxDepth);

    }

    public static int maxDepth(TreeNode1 root) {
        Queue<TreeNode1> elementQueue = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        elementQueue.add(root);
        int numbersOfLevels = 0;
        while (true) {
            int nodeCountAtLevels = elementQueue.size();
            if (nodeCountAtLevels == 0) {
                return numbersOfLevels;
            }
            while (nodeCountAtLevels > 0) {
                TreeNode1 element = elementQueue.poll();
                if (element.left != null) {
                    elementQueue.add(element.left);
                }
                if (element.right != null) {
                    elementQueue.add(element.right);
                }
                nodeCountAtLevels--;
            }
            numbersOfLevels++;
        }
    }
}


