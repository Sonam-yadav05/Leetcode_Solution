class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=nums[0];
        for(int i=1;i<n;i++){
            ans[i]=nums[i]+ans[i-1];
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         ans[i] += nums[j];
        //     }
        // }
        return ans;
        
    }
}