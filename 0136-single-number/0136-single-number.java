
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int i=0,j=1;
        while(j<nums.length){
            if((nums[i] ^ nums[j]) == 0){
                i += 2;
                j = i+1;
            }
            else{
                return nums[i];
            }

        }
        return nums[i];






















        // Arrays.sort(nums);
        // int n = nums.length;
        // int idx=-1;
        // for(int i = 0 ; i < n;i+=2){
        //     if(i==n-1){
        //         idx=i;
        //         break;
        //     }
        //     if(nums[i]!=nums[i+1]){
        //         idx=i;
        //         break;
        //     }
        // }
        // return nums[idx];
        
    
    }
}