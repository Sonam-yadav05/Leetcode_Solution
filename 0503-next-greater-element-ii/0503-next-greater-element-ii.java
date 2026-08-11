class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int j=n-1;j>=0;j--){
            st.push(nums[j]); 
        }
        int i=n-1;
        while(i>=0){
            int a=nums[i];
            while(st.size()>0 && nums[i]>=st.peek()) st.pop();
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(nums[i]);
            i--;
        }
        return ans;   
    }
}