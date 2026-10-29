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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        int val = preorder[0];
        TreeNode root = new TreeNode(val);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i=1;i<preorder.length;i++){
            if(preorder[i] > val) right.add(preorder[i]);
            else left.add(preorder[i]);
        }

        int[] l = convertToArray(left);
        int[] r = convertToArray(right);

        root.left = bstFromPreorder(l);
        root.right = bstFromPreorder(r);
        return root;
    }

    public int[] convertToArray(List<Integer> list){
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}