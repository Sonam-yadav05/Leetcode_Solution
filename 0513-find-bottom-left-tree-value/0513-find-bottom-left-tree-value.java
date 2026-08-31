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
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        view(root,ans,0);
        int size = ans.size()-1;
        return ans.get(size);
        
    }
    public void view(TreeNode root,List<Integer> ans,int level){
        if(root==null) return;
        if(level>=ans.size()) ans.add(root.val);
        view(root.left,ans,level+1);
        view(root.right,ans,level+1);
    }
}