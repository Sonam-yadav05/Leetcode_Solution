class Solution {
    public int[] findMode(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);

        List<Integer> arr = new ArrayList<>();

        if (ans.size() == 1) {
            int[] result = new int[1];
            result[0] = ans.get(0);
            return result;
        }

        int i = 0, j = 1;
        int max = 0;

        while (i < ans.size()) {
            j = i + 1;

            while (j < ans.size() && ans.get(i).equals(ans.get(j))) {
                j++;
            }

            int count = j - i;

            if (count > max) {
                max = count;
                arr.clear();
                arr.add(ans.get(i));
            } 
            else if (count == max) {
                arr.add(ans.get(i));
            }

            i = j;
        }

        int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}








// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int[] findMode(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         inorder(root,ans);
//         List<Integer> arr = new ArrayList<>();
//         if(ans.size()==1){
//             int[] result = new int[1];
//             result[0]=ans.get(0);
//             return result;
//         } 
//         int i=0,j=1;
//         while(j<ans.size()){
//             if(ans.get(i)==ans.get(j)){
//                 j++;
//                 arr.add(ans.get(i));
//             }
//             else{
//                 i=j;
//                 j++;
//             }
//         }
//         int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
//         return result;


        
//     }
//     public void inorder(TreeNode root,List<Integer> ans){
//         if(root==null) return;
//         inorder(root.left,ans);
//         ans.add(root.val);
//         inorder(root.right,ans);
//     }
// }