class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(h.containsKey(ch)){
                char n=sb.charAt(0);
                h.remove(n);
                sb.deleteCharAt(0);
            }
            sb.append(ch);
            h.put(ch,1);
            max=Math.max(sb.length(),max);
        }
        return max;
    }
}