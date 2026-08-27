class Solution {
    public boolean isPerfectSquare(long n) {
        long low=1,high=n;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid==n)
                return true;
            else if(mid*mid<n){
        
                low=mid+1;
            }
            else
                high=mid-1;
        }
         return false;
    }
}  
    