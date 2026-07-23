class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxsum=0;
        int windowsum=0;
        int n=cardPoints.length;
        for(int i=0;i<=k-1;i++){
            windowsum +=cardPoints[i];
        }
        maxsum=windowsum;
        for(int i=1;i<=k;i++){
            windowsum +=cardPoints[n-i];
            windowsum -=cardPoints[k-i];
            
            maxsum= Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
}