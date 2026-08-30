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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        Paths(root,"",ans);
        return ans;
    }
    public void Paths(TreeNode root,String s,List<String> ans){
        if(root==null) return;
        
        if(s.isEmpty()) s+=Integer.toString(root.val);
        else s = s + "->"+ root.val;

        if(root.left==null && root.right==null){
            ans.add(s);
            return;
        }
        Paths(root.left,s,ans);
        Paths(root.right,s,ans);

    }
}