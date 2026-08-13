class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int i=0;
        int count=0;
        while(i<n){
            int j=i;
            int sum=0;
            while(j<n){
                sum += nums[j];
                if(sum==goal) count++;
                j++;
            }
            i++;
        }
        return count;
        
    }
}