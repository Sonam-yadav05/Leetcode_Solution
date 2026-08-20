class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max=0;
        for(int n : nums) max=Math.max(max,n);
        int start=1;
        int end=max;
        int ans=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                count += (nums[i]-1)/mid;
                if(count>maxOperations) break;               
            }
            if(count<=maxOperations){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
            
        }
        return ans;
        
    }
}