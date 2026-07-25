class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        HashMap <Character,Integer> map1=new HashMap<>();
        HashMap <Character,Integer> map2=new HashMap<>();

        for(int i=0;i<ch1.length;i++){
            map1.put(ch1[i],map1.getOrDefault(ch1[i],0)+1);
        }
        for(int i=0;i<ch2.length;i++){
            map2.put(ch2[i],map2.getOrDefault(ch2[i],0)+1);
        }
        for(char ch:map1.keySet()){
            int f1=map1.getOrDefault(ch,0);
            int f2=map2.getOrDefault(ch,0);
            if(Math.abs(f1-f2)>3){
                return false;
            }
        }
        for(char ch:map2.keySet()){
            int f1=map1.getOrDefault(ch,0);
            int f2=map2.getOrDefault(ch,0);
            if(Math.abs(f1-f2)>3){
                return false;
            }
        }
        return true;
    }
}