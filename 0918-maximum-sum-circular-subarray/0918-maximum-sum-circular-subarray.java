class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum += nums[i];
        }
        int currmin=0,currmax=0;
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currmin = Math.min(currmin+nums[i],nums[i]);
            ans1 = Math.min(ans1,currmin);
            currmax = Math.max(currmax+nums[i],nums[i]);
            ans2=Math.max(ans2,currmax);

        }
        if(ans2 < 0) return ans2;
        ans1 = arr_sum - ans1;
        return Math.max(ans1,ans2);
        
    }
}