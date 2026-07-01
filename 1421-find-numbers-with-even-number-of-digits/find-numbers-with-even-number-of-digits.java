class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int d=0;
            int n=nums[i];
            while(n>0){
                d++;
                n/=10;
            }
            if(d%2==0){
                c++;
            }
        }
        return c;
    }
}