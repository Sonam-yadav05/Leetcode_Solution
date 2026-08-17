class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                idx=i;
                break;
            }
        }
        int min1=nums[0];
        int min2=nums[idx+1];
        if(min1>min2) return min2;
        else return min1;
        
    }
}