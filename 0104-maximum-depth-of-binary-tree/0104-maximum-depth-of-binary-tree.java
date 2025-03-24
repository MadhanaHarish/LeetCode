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

    public int solve(TreeNode root, int max) {
        int depth = ++max;
        if(root == null) return depth - 2;
        return Math.max(solve(root.left, depth), solve(root.right, depth));

    }

    public int maxDepth(TreeNode root) {
        return solve(root, 1);
    }
}