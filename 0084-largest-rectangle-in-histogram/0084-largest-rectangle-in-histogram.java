class Solution {
    public int[] nextSmallestElement(int[] heights){
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];
        st.push(n-1);
        nse[n-1]=n;
        int i=n-2;
        while(i>=0){
            while(st.size()>0 && heights[i]<=heights[st.peek()]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
            i--;
        }
        return nse;

    }
    public int[] previousSmallestElement(int[] heights){
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[n];
        st.push(0);
        pse[0]=-1;
        int i=1;
        while(i<n){
            while(st.size()>0 && heights[i]<=heights[st.peek()]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
            i++;
        }
        return pse;

    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=nextSmallestElement(heights);
        int[] pse=previousSmallestElement(heights);
        int maxArea=0;
        int i=0;
        while(i<n){
            int area=heights[i]*(nse[i]-pse[i]-1);
            if(area>maxArea) maxArea=area;
            i++;
        }
        return maxArea;
        
    }
}