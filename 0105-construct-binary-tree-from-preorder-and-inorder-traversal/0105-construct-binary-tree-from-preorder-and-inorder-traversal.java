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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        TreeNode root = helper(0,n-1,0,n-1,preorder,inorder);
        return root;
    }

    public TreeNode helper(int preLow,int preHi,int inLow,int inHi,int[] preorder, int[] inorder){
        if(preLow > preHi || inLow > inHi) return null;
        TreeNode node = new TreeNode(preorder[preLow]);
        int val=preorder[preLow];
        int r=0;
        for(int i=inLow;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-inLow;
        node.left=helper(preLow+1,preLow+cnt,inLow,r-1,preorder,inorder);
        node.right=helper(preLow+cnt+1,preHi,r+1,inHi,preorder,inorder);
        return node;
    }
}