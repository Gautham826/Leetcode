class Solution {
    public boolean sumGame(String num) {
     int n=num.length();
     int count=0;
     int sum=0;
     for(int i=0;i<n/2;i++){
        if(num.charAt(i)=='?'){
            count++;
        }
        else{
            sum+=num.charAt(i)-'0';
        }
     }
     for(int i=n/2;i<n;i++){
        if(num.charAt(i)=='?'){
            count--;
        }
        else{
            sum-=num.charAt(i)-'0';
        }
     }
     if(count% 2 !=0) {
        return true;
     }
     if(sum*2==-count*9){
        return false;
     }
     else{
        return true;
     }    
    }
}