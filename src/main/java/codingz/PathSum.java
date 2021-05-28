package codingz;

/*
https://leetcode.com/problems/path-sum/

112. Path Sum

 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }
        targetSum = targetSum - root.val;
        boolean left = hasPathSum(root.left, targetSum);
        if (left) return true;
        boolean right = hasPathSum(root.right, targetSum);
        if (right) return true;
        return false;
    }

    public static void main(String[] args) {
        PathSum obj = new PathSum();
        TreeNode root = new TreeNode(1);
        System.out.println(obj.hasPathSum(root, 0));

        root = null;
        System.out.println(obj.hasPathSum(root, 10));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(obj.hasPathSum(root, 3));
    }
}
