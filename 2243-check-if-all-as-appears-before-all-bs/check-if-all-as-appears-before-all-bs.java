class Solution {
    public boolean checkString(String s) {
        if(s.indexOf('b')>=s.lastIndexOf('a')){
            return true;
        }
        else if(s.indexOf('a')== -1|| s.indexOf('b')== -1 ||s.indexOf("")== -1){
            return true;
        }
        else{
            return false;
        }
    }
}