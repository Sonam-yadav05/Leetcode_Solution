class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int idx=0;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]<nums[i]){
                idx=i;
            }
        }
        int start=0;
        int end=0;
        if(target>=nums[0] && target<=nums[idx]){
            start=0;
            end=idx;
        }
        else{
            start=idx+1;
            end=n-1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;























        // Arrays.sort(nums);
        // int n=nums.length;
        // int start=0;
        // int end=n-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(nums[mid]==target) return true;
        //     else if(nums[mid]>target) end=mid-1;
        //     else start=mid+1;
        // }
        // return false;
        
    }
}