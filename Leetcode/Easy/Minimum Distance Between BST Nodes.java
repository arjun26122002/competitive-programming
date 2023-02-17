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
    int minDiff = Integer.MAX_VALUE;
    TreeNode prev = null;
    
    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }
    
    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        
        inOrderTraversal(node.left);
        
        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev.val);
        }
        
        prev = node;
        
        inOrderTraversal(node.right);
    }
}
