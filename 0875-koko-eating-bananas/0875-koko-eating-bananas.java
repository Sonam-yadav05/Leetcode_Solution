class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for (int p : piles) max = Math.max(max, p);
        int start=1;
        int end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                sum += (piles[i] + mid - 1) / mid;
            }
            if(sum<=h) end=mid-1;
            else start=mid+1;

        }
        return start;
        
    }
}