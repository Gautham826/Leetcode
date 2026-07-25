class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            h.put(c,h.getOrDefault(c,0)-1);
        }
        for(int val:h.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}