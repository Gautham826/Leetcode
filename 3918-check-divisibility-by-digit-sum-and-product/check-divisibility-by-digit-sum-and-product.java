class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int org=n;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        int tot=sum+prod;
        if(org%tot==0){
            return true;
        }
        else{
            return false;
        }
    }
}