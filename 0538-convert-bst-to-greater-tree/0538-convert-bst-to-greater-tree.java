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
    public TreeNode convertBST(TreeNode root) {
        List<TreeNode> arr = new ArrayList<>();
        inorder(root,arr);
        for(int i=arr.size()-2;i>=0;i--){
            arr.get(i).val =arr.get(i).val + arr.get(i+1).val;
        }
        return root;

        
    }
    public void inorder(TreeNode root,List<TreeNode> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
}