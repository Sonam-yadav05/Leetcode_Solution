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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count=1;
        while(q.size()>0){
            int size = q.size();
            List<Integer> inner = new ArrayList<>();

            for(int i=1;i<=size;i++){
                TreeNode curr = q.remove();
                if(curr!=null) inner.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(count%2==0){
                Collections.reverse(inner);
                ans.add(inner);

            } 
            else ans.add(inner);
            count++;

            
        }
        return ans;
    }
}