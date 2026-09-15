class Solution {
    public boolean isPowerOfFour(int n) {
        boolean flag = true;
        int count=0;
        while(n > 0){
            if(flag){
                if((n & 1) == 1) count++;
                else flag =  false;
            }
            else{
                if((n & 1) == 1) return false;
                else flag = true;
            }
            n = n>>1;
        }
        if(count==1) return true;
        else return false;










        // if(n==0 || n<0) return false;
        // if(n==1) return true;
        // while(n>1){
        //     if(n%4!=0) return false;
        //     n=n/4;
        // }
        // return true;
        
    }
}