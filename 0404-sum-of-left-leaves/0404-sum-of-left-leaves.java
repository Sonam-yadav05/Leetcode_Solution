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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=leftSum(root,0);
        return sum;
        
    }
    public int leftSum(TreeNode root,int sum){
        if(root==null) return sum;
        if(root.left!=null && root.left.left==null && root.left.right==null) sum += root.left.val;
        sum = leftSum(root.left,sum);
        sum = leftSum(root.right,sum);
        return sum;
    }
}