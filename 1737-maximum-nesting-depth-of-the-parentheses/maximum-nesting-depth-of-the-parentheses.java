class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxddep =0;
        char[] ch=s.toCharArray();

        for(int i=0;i<=ch.length-1;i++){
            if(ch[i] == '('){
                depth++;
            }
            if(ch[i] == ')'){
                depth--;
            }

            maxddep = Math.max(depth,maxddep);
        }
        return maxddep;
        
    }
}