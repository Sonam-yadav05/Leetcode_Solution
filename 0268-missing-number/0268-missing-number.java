class Solution {
    public int missingNumber(int[] nums) {
        int x=0;
        for(int i=1;i<=nums.length;i++){
            x ^= i;
        }
        for(int i=0;i<nums.length;i++){
            x ^= nums[i];
        }
        return x;







        // int n = nums.length;
        // int sum = n*(n+1)/2;
        // int numsSum = 0;
        // for(int ele : nums){
        //     numsSum += ele;
        // }

        // return sum-numsSum;
        
    }
}