package codingz;

/*

https://leetcode.com/problems/balanced-binary-tree/

110. Balanced Binary Tree

 */

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (height(root) == -1)
            return false;
        return true;
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
