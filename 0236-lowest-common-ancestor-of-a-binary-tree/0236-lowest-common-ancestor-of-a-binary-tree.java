/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode x = lowestCommonAncestor(root.left,p,q);
        TreeNode y = lowestCommonAncestor(root.right,p,q);
        if(x!=null && y!=null) return root;
        else return (x==null) ? y:x;
    }
    //     if(root==null) return null;
    //     if(root.val==p.val || root.val==q.val){
    //         return root;
    //     }
    //     boolean isPliesLeft = exists(root.left,p);
    //     boolean isQliesLeft = exists(root.left,q);
    //     if(isPliesLeft && isQliesLeft) return lowestCommonAncestor(root.left,p,q);
    //     else if(!isPliesLeft && !isQliesLeft) return lowestCommonAncestor(root.right,p,q);
    //     else return root;
    // }
    // public boolean exists(TreeNode root, TreeNode node){
    //     if(root==null) return false;
    //     if(root.val==node.val) return true;
    //     return exists(root.left,node) || exists(root.right,node);
    // }
}