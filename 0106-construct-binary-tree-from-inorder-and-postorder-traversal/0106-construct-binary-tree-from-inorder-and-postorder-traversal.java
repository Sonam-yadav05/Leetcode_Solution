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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        TreeNode root = helper(0,n-1,0,n-1,inorder,postorder);
        return root;
    }

    public TreeNode helper(int postLow,int postHi,int inLow,int inHi, int[] inorder,int[] postorder){
        if(postLow > postHi || inLow > inHi) return null;
        TreeNode node = new TreeNode(postorder[postHi]);
        int val=postorder[postHi];
        int r=0;
        for(int i=inLow;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-inLow;
        node.left=helper(postLow,postLow+cnt-1,inLow,r-1,inorder,postorder);
        node.right=helper(postLow+cnt,postHi-1,r+1,inHi,inorder,postorder);
        return node;
    }
        
    
}