class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }
}

/* Approach
First Sort the Array beause it is easy to check whether two element is equal or not .
Then Compare elements one by one.
We Only have to return a true or false.*/


