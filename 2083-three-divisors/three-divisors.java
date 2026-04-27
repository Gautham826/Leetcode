class Solution {
    public boolean isThree(int n) {
        /*if(n<4){
            return false;
        }
        else{
            return true;
        }*/
        int m=1;
        int k=1;
        int c=0;
        int l=n;
        for(k=1;k<=n;k++){
            for(m=1;m<=n;m++){
                l=k*m;
                if(l==n){
                    c++;
                    }
            }   
        }
        if(c==3){
            return true;
        }
        else{
            return false;
        }
    }
}