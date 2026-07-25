class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0.00000;
        double windowsum=0.00000;
        for(int i=0;i<k;i++){
            windowsum +=nums[i];
        }
        max=windowsum;
        //windowsum=windowsum/k;
        for(int i=k;i<=nums.length-1;i++){
            windowsum-=nums[i-k];
            windowsum+=nums[i];
            max=Math.max(max,windowsum);
        }
        
        return max/k;
    }
}