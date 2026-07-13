class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum=sum+nums[i];
            System.out.println(sum);
        }
        int mis=(n*(n+1))/2;
        int x=mis-sum; 
        return x;
}
}