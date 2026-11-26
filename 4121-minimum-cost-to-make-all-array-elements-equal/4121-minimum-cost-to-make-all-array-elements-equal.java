class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        long ans = Long.MAX_VALUE;
        int i=0;
        while(i<n){
            int j = i;

            while(j+1 < n && nums[j+1] == nums[i]) j++;
            if(j >= 1 && i <= n-2){
                long val = nums[i];
                long cost1 = (long) i*val;
                long cost2 = (long)(n-1-j)*val;
                ans = Math.min(ans,cost1 + cost2);
            }
            i=j+1;
        }
        return ans;
        
    }
}