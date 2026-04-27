class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){// 1!=0
                temp = nums[i];// 1
                nums[i]=nums[j];// 0
                nums[j]=temp;// 1
                j++;
            }
        }
    }
}