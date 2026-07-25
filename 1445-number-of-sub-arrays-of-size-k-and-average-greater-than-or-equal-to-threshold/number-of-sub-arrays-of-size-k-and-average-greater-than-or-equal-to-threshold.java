class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowsum=0;
        //int maxsum=0;
        int val=0;
        int c=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        if(windowsum >=threshold * k){
                c++;
        }
        //maxsum=windowsum;
        for(int i=k;i<arr.length;i++){
            windowsum-=arr[i-k];
            windowsum+=arr[i];
            if(windowsum >=threshold * k){
                c++;
            }
        }
        return c;
    } 
}