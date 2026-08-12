class Solution {
    public void merge(int[] nums,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=nums[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i]=nums[i+m+1];
        }
        int i=0,j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                nums[k]=L[i];
                i++;
            }
            else{
                nums[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k++]=L[i++];
        }
        while(j<n2){
            nums[k++]=R[j++];
        }

    }
    public void mergeSort(int[] nums,int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(nums,l,m);
            mergeSort(nums,m+1,r);
            merge(nums,l,m,r);
        }
    }
    public int[] sortArray(int[] nums) {
        int r=nums.length;
        mergeSort(nums,0,r-1);
        return nums;
    }
}