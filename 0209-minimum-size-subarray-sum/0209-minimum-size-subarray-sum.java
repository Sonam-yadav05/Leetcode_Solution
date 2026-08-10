class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}














// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {

//         int i=0;
//         int min=Integer.MAX_VALUE;
//         while(i<nums.length){
//             int j=i;
//             int sum=0;
//             while(j<nums.length){   
//                 sum += nums[j];
//                 if(sum>target ||sum==target){
//                     int x=j-i+1;
//                     if(min>x) min=x;
//                     break;
//                 }
//                 j++;
//             }
//             i++;
//         }
//         if(min==Integer.MAX_VALUE) return 0;
//         return min;
        
//     }
// }