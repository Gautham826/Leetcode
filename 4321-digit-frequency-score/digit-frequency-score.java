class Solution {
    public int digitFrequencyScore(int n) {
        int rev=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        while(n>0){
            int d=n%10;
            m.put(d,m.getOrDefault(d,0)+1);
            n/=10;
        }
        int s=0;
        for(int key:m.keySet()){
            s+=key*m.get(key);
        }
        return s;
    }
}