class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
        
    }
}