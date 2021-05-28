package codingz;

/*

https://leetcode.com/problems/binary-tree-paths/

257. Binary Tree Paths



 */

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root==null)
            return result;
        if (root.left==null && root.right==null) {
            result.add(String.valueOf(root.val));
            return result;
        }
        List<String> tmp;
        if (root.left!=null){
            tmp = binaryTreePaths(root.left);
            if (tmp != null) {
                for (String s : tmp)
                    result.add(root.val + "->" + s);
            }
        }
        if (root.right!=null){
            tmp = binaryTreePaths(root.right);
            if (tmp != null) {
                for (String s : tmp)
                    result.add(root.val + "->" + s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTreePaths obj = new BinaryTreePaths();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> result = obj.binaryTreePaths(root);
        System.out.println(result);

        root = null;
        result = obj.binaryTreePaths(root);
        System.out.println(result);

        root = new TreeNode(1);
        result = obj.binaryTreePaths(root);
        System.out.println(result);

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        result = obj.binaryTreePaths(root);
        System.out.println(result);

        root = new TreeNode(1);
        root.right = new TreeNode(2);
        result = obj.binaryTreePaths(root);
        System.out.println(result);
    }

}
