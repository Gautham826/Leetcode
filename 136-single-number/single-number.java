class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count^nums[i];// here we are using XOR operation .here we use to cancel the same number.
        }return count;
    }
}
/*example-1:
   2 2 1 => where 2 gets cancel and prints 1.*/