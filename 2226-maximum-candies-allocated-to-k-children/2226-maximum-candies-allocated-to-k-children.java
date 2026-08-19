class Solution {
    public boolean isPossible(int mid,int[] candies,long k){
        long kids=0;
        for(int i=0;i<candies.length;i++){
            int x=candies[i]/mid;
            kids += x;
            if(kids>=k) return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        for(int n : candies) max=Math.max(max,n);
        int start=1;
        int end=max;
        int ans=0;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(isPossible(mid,candies,k)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;


        
    }
}