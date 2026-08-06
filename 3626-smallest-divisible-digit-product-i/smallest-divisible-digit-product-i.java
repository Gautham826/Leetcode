class Solution {
    public int smallestNumber(int n, int t) {
        while(n>0){
            int x=n;
            int p=1;
            while(x>0){
                int d=x%10;
                p=p*d;
                x/=10;
            }
            if(p%t==0){
                return n;
            }
            n=n+1;
        }
        return 0;
    }
}