
class Solution {
    public int singleNumber(int[] nums) {
        // hashset
        // int n = nums.length;
        // HashSet<Integer> set = new HashSet<>();
        // set.add(nums[0]);
        // for(int i=1;i<n;i++){
        //     if(set.contains(nums[i])) set.remove(nums[i]);
        //     else set.add(nums[i]);
        // }
        // int ans=0;
        // for(int ele : set){
        //     ans = ele;
        // }
        // return ans;
        

// Bit Manipulation
            int ans =0;
            for(int i=0;i<nums.length;i++){
                ans = ans ^ nums[i];
            }
            return ans;








        // if(nums.length==1) return nums[0];
        // Arrays.sort(nums);
        // int i=0,j=1;
        // while(j<nums.length){
        //     if((nums[i] ^ nums[j]) == 0){
        //         i += 2;
        //         j = i+1;
        //     }
        //     else{
        //         return nums[i];
        //     }

        // }
        // return nums[i];



// iteration 
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