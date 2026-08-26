class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        int sum=k;
        while(set.contains(sum)){
            sum+=k;
        }
        return sum;
    }
}