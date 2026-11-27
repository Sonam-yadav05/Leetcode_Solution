class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] suffix = new int[n];
        int[] prefix = new int[n];
        suffix[n-1] = 1;
        suffix[n-2] = nums[n-1];
        prefix[0] = 1;
        prefix[1] = nums[0];

        for(int i=2;i<n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for(int j=n-3;j>=0;j--){
            suffix[j] = suffix[j+1]*nums[j+1];
        }

        for(int i=0;i<n;i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;    
    }
}