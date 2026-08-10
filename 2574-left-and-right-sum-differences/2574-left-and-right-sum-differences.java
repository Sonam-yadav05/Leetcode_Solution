class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        leftSum[0]=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum[i+1]=nums[i]+leftSum[i];
        }
        for(int i=nums.length-1;i>0;i--){
            rightSum[i-1]=nums[i]+rightSum[i];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;

    }
}