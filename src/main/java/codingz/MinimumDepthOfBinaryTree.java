package codingz;

/*
https://leetcode.com/problems/minimum-depth-of-binary-tree/

111. Minimum Depth of Binary Tree

 */

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        // Base case : Leaf Node. This accounts for height = 1.
        if (root.left == null && root.right == null)
            return 1;

        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return minDepth(root.right) + 1;

        // If right subtree is NULL, recur for left subtree
        if (root.right == null)
            return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left),
                minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree obj = new MinimumDepthOfBinaryTree();
        TreeNode p = new TreeNode(1);
        System.out.println(obj.minDepth(p));

        p = null;
        System.out.println(obj.minDepth(p));

        p = new TreeNode(1);
        p.left = null;
        p.right = new TreeNode(2);
        System.out.println(obj.minDepth(p));

        // [2,null,3,null,4,null,5,null,6]
        p = new TreeNode(2);
        p.left = null;
        p.right = new TreeNode(3);
        p.right.right = new TreeNode(4);
        p.right.left = null;
        p.right.right = new TreeNode(5);
        p.right.right.left = null;
        p.right.right.right = new TreeNode(6);
        System.out.println(obj.minDepth(p));
    }
}
