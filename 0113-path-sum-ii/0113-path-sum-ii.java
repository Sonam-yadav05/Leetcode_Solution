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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        preorder(root,targetSum,ans,new ArrayList<>(),0);
        return ans;
    }

    public void preorder(TreeNode root, int targetSum,List<List<Integer>> ans,List<Integer> list,int sum){
        if(root == null) return;
        list.add(root.val);
        sum += root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                ans.add(new ArrayList<>(list));
            }
        }
        else{
            preorder(root.left,targetSum,ans,list,sum);
            preorder(root.right,targetSum,ans,list,sum); 
        }
        list.remove(list.size() - 1);
    }
}