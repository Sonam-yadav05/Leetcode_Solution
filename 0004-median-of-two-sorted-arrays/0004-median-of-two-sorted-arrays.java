class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = (nums1.length + nums2.length);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] mergeArr = new int[n];
        int i = 0,j =0,k=0;
        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]  ){
                mergeArr[k] = nums1[i];
                k++;
                i++;
            }
            else {
                mergeArr[k] = nums2[j];
                k++;
                j++;
            }

        }
        while(i < n1){
            mergeArr[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n2){
            mergeArr[k] = nums2[j];
            j++;
            k++;
        }
        if(n % 2==0){
            return  (double)((mergeArr[n/2]+mergeArr[(n/2) - 1])/2.0);
        }
        
        return (double)(mergeArr[n/2]);


        
    }
}