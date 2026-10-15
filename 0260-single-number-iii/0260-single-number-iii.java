class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i];
        }
        int mask = (xor & (xor-1)) ^ xor;
        int b1=0;
        int b2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & mask)!=0) b1 ^= nums[i];
            else b2 ^= nums[i];
        }
        ans[0]=b1;
        ans[1]=b2;
        return ans;
    }
}