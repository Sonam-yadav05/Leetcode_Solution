class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int idx=-1;
        if(n==1) return 0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==end) return mid;
            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else end=mid;

        }
        return idx;

















        // int n=nums.length;
        // int idx=-1;
        // if(n==1) return 0;
        // for(int i=0;i<n;i++){
        //     if(nums[0]>nums[1]) idx=0;
        //     else if(i==n-1){
        //         if(nums[i]>nums[i-1]) idx=i;
        //     }
        //     else{
        //         if(nums[i]>nums[i+1] && nums[i]>nums[i-1]) idx=i;
        //     }

        // }
        // return idx;
        
    }
}