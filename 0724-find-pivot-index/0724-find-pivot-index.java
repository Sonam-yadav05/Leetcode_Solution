class Solution {
    public int lSum(int[] nums,int i){
        int sum1=0;
        for(int j=0;j<i;j++){
            sum1 += nums[j];
        }
        return sum1;
    }
    public int rSum(int[] nums,int i){
        int sum2=0;
        for(int j=i+1;j<nums.length;j++){
            sum2 += nums[j];
        }
        return sum2;
    }
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int i=0;
        int pivot=-1;
        while(i<n){
            int leftSum=0,rightSum=0;
            if(i==0) leftSum=0;
            else leftSum=lSum(nums,i);
            if(i==n-1) rightSum=0;
            else rightSum=rSum(nums,i);
            if(leftSum==rightSum){
                pivot=i;
                break;
            }
            i++;
        }
        return pivot;
        
    }
}