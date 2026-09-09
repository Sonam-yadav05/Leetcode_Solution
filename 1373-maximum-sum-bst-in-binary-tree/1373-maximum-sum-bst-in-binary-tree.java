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
class Quad {
    long min;
    long max;
    boolean isBST;
    long sum;

    Quad(long min,long max,boolean isBST,long sum){
        this.min = min;
        this.max = max;
        this.isBST = isBST;
        this.sum = sum;
    }

}

class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        minMax(root);
        return maxSum;
    }
    public Quad minMax(TreeNode root){
        if(root==null) return new Quad(Long.MAX_VALUE,Long.MIN_VALUE,true,0);
        Quad lst = minMax(root.left);
        Quad rst = minMax(root.right);
        long min = Math.min(root.val,Math.min(lst.min,rst.min));
        long max = Math.max(root.val,Math.max(lst.max,rst.max));
        long sum = root.val + lst.sum + rst.sum ;
        boolean isBST = lst.isBST && rst.isBST && (lst.max < root.val) && (rst.min > root.val);
        if(isBST) maxSum = (int)Math.max(maxSum,sum);
        return new Quad(min,max,isBST,sum);

    }
}