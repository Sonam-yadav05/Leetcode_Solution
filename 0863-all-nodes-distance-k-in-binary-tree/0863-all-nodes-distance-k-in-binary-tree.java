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
    List<List<Integer>> adj = new ArrayList<>();
    TreeNode node=null;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        for(int i=0;i<=501;i++){
            adj.add(new ArrayList());
        }
        reformation(root,target);
        List<Integer> ans = new ArrayList<>();
        ans = dfs(node.val,-1,k,0,ans);
        return ans;

        
    }

    public List<Integer> dfs(int node,int parent,int k,int level,List<Integer> ans){
        if(level == k) ans.add(node);
        for(int v : adj.get(node)){
            if( v != parent){
                dfs(v,node,k,level+1,ans);
            }
        }
        return ans;
    }

    public void reformation(TreeNode root,TreeNode target){
        if(root == null) return;
        if(root.val == target.val) node = root;
        if(root.left != null){
            adj.get(root.val).add(root.left.val);
            adj.get(root.left.val).add(root.val);
            reformation(root.left,target);
        }
        if(root.right != null){
            adj.get(root.val).add(root.right.val);
            adj.get(root.right.val).add(root.val);
            reformation(root.right,target);
        }

    }
}