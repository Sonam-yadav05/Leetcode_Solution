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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        levels(root);
        return max;    
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftlevels = levels(root.left);
        int rightlevels = levels(root.right);
        if((leftlevels + rightlevels)>max) max =leftlevels + rightlevels;
        return 1 + Math.max(leftlevels,rightlevels); 

    }
}