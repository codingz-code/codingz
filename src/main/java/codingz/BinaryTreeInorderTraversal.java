package codingz;

/*

https://leetcode.com/problems/binary-tree-inorder-traversal/

94. Binary Tree Inorder Traversal

Given the root of a binary tree, return the inorder traversal of its nodes' values.



Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
Example 4:


Input: root = [1,2]
Output: [2,1]
Example 5:


Input: root = [1,null,2]
Output: [1,2]


Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Follow up: Recursive solution is trivial, could you do it iteratively?

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.empty()){
            TreeNode node = s.peek();
            if (node.left != null) {
                s.push(node.left);
                node.left = null;
            } else {
                result.add(node.val);
                s.pop();
                if (node.right != null)
                    s.push(node.right);
            }
        }
        return result;
    }

    public List<Integer> inorderTraversalv2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    public void inorderTraversal(TreeNode node, List<Integer> result) {
        if (node==null)
            return;
        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> result = obj.inorderTraversal(root);
        System.out.println(result);

        root = null;
        result = obj.inorderTraversal(root);
        System.out.println(result);

        root = new TreeNode(1);
        result = obj.inorderTraversal(root);
        System.out.println(result);

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        result = obj.inorderTraversal(root);
        System.out.println(result);

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        result = obj.inorderTraversal(root);
        System.out.println(result);

    }

}
