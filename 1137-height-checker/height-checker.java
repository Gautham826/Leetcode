import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=heights.clone();//clone is used for doing a copy of an array
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }return count;
    }
}