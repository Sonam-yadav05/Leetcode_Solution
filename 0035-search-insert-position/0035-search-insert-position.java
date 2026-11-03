class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        // int lo=0,hi=n-1;
        // while(lo <= hi){
        //     int mid=(lo+hi)/2;
        //     if(nums[mid]==target){
        //         return mid;
        //     }
        //     else if(nums[mid]<target){
        //         lo=mid+1;
        //     }
        //     else hi=mid-1;    
        // }
        // return lo;
        int i=0;
        while(i<n){
            if(nums[i] == target) return i;
            else if(nums[i] > target) return i;
            else i++;
        }
        return i;
        
    }
}