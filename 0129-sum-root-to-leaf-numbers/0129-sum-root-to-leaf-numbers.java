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
    public int sumNumbers(TreeNode root) {
        List<String> ans = new ArrayList<>();
        paths(root,ans,"");
        int sum = 0;
        for(int i=0;i<ans.size();i++){
            sum += Integer.parseInt(ans.get(i));
        }
        return sum;

        
    }
    public void paths(TreeNode root,List<String> ans,String s){
        if(root==null) return;

        if(s.length()==0) s += Integer.toString(root.val);
        else s = s + root.val;

        if(root.left==null && root.right==null){
            ans.add(s);
            return;
        }

        paths(root.left,ans,s);
        paths(root.right,ans,s);
    }
}