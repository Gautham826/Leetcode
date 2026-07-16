class Solution {
    public boolean isPalindrome(int x) {
        //boolean palin=false;
        int org=x;
        int rev=0;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev==org){
            return true;
        }
        else{
            return false;
        }
    }
}