class Solution {
    public int arrangeCoins(int n) {

        long s=1;
        long e=n;
        while(s<=e){
            long m=s+(e-s)/2;
            long coins=m*(m+1)/2;
            if(coins==n){
                return (int)m;
            }
            else if(coins<n){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return (int)s-1; 
    }
}