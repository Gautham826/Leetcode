class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            h.put(nums[right], h.getOrDefault(nums[right], 0) + 1);
            while(h.get(nums[right])>k){
                //nums[left]--;
                h.put(nums[left], h.get(nums[left]) - 1);
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}