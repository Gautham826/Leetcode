class Solution {
    public int reverseDegree(String s) {
        int prod=1;
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int freq='z'-ch+1;
            prod=freq*(i+1);
            sum+=prod;
        }
        return sum;
    }
}