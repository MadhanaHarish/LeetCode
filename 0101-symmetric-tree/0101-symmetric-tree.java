/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode leftSubTree, TreeNode rightSubTree) {
        if(leftSubTree == null && rightSubTree == null) return true;
        if(leftSubTree == null || rightSubTree == null) return false;
        if(leftSubTree.val != rightSubTree.val) return false;
        return helper(leftSubTree.left, rightSubTree.right) && helper(leftSubTree.right, rightSubTree.left);
    }
}