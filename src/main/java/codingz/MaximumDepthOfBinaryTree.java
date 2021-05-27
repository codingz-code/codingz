package codingz;

/*

https://leetcode.com/problems/maximum-depth-of-binary-tree/

104. Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
Example 3:

Input: root = []
Output: 0
Example 4:

Input: root = [0]
Output: 1


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100


 */

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
        TreeNode p = new TreeNode(1);
        System.out.println(obj.maxDepth(p));

        p = null;
        System.out.println(obj.maxDepth(p));

        p = new TreeNode(1);
        p.left = null;
        p.right = new TreeNode(2);
        System.out.println(obj.maxDepth(p));
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
