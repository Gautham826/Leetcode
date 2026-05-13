import java.util.Arrays;
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int m=nums.length;
        int []n=new int[2*nums.length];
       // Arrays.reverse(nums);
       for(int i=0;i<nums.length;i++){
        n[i]=nums[i];
        n[i+m]=nums[m-i-1];
       }
       return n;
    }
}