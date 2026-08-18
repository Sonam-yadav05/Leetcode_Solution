class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int w=0;w<weights.length;w++){
            max=Math.max(max,weights[w]);
            sum += weights[w];
        }
        int start=max;
        int end=sum;
        while(start<=end){
            int mid= start + (end-start)/2;
            int d=1;
            int total=0;
            for(int i=0;i<weights.length;i++){
                if(total + weights[i] <=mid){
                    total += weights[i];
                }
                else{
                    d++;
                    total = weights[i];
                }
            }
            if(d<=days) end=mid-1;
            else start=mid+1;
        }
        return start;

        
    }
}